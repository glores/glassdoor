package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import dao.EmployerDAO;
import model.Employer;

/**
 * Implementation of the interface that contains the employer operations.
 * @author Gloria
 *
 */
public class JdbcEmployerDAO implements EmployerDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Checks if the given employer already exists in the database.
     * @param employer Employer to be checked.
     * @return if the given employer already exists.
     */
    public boolean exists(Employer employer) {
        String sql = "select id from employer where id = ?";
        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, employer.getId());
                ResultSet res = ps.executeQuery();
                return res.next();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Inserts the given list of employers.
     * @param employers List of employers.
     */
    public void insert(List<Employer> employers) {
        StringBuilder sql = new StringBuilder("INSERT IGNORE INTO EMPLOYER VALUES ");
        for (int i = 0; i < employers.size(); i++) {
            sql.append("(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?),");
        }

        // We remove last comma
        String query = sql.toString().substring(0, sql.toString().length() - 1);
        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                int i = 1;
                for (Employer employer : employers) {
                    ps.setInt(i++, employer.getId());
                    ps.setString(i++, employer.getName());
                    ps.setString(i++, employer.getWebsite());
                    ps.setString(i++, employer.getIndustry());
                    ps.setInt(i++, employer.getNumberOfRatings());
                    ps.setString(i++, employer.getOverallRating());
                    ps.setString(i++, employer.getRatingDescription());
                    ps.setString(i++, employer.getCultureAndValuesRating());
                    ps.setString(i++, employer.getSeniorLeadershipRating());
                    ps.setString(i++, employer.getCompensationAndBenefitsRating());
                    ps.setString(i++, employer.getCareerOpportunitiesRating());
                    ps.setString(i++, employer.getWorkLifeBalanceRating());
                    ps.setString(i++, employer.getRecommendToFriendRating());
                    ps.setInt(i++, employer.getSectorId());
                    ps.setString(i++, employer.getSectorName());
                    ps.setInt(i++, employer.getIndustryId());
                    ps.setString(i++, employer.getIndustryName());
                }

                ps.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return Returns an employer given a name.
     */
    @Override
    public Employer findByEmployerName(String empName) {
        String sql = "SELECT * FROM EMPLOYER WHERE name=?";

        try (Connection conn = dataSource.getConnection()) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, empName);
                Employer employer = null;
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    employer = new Employer(rs.getInt("id"), rs.getString("name"), rs.getString("website"));
                }
                rs.close();

                return employer;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
