package dao;

import java.util.List;

import model.Employer;

/**
 * Interface that contains the operations that can be made over an employer.
 * @author Gloria
 *
 */
public interface EmployerDAO {
    /**
     * Inserts a list of employers.
     * @param employers Employers list.
     */
    public void insert(List<Employer> employers);
    /**
     * Returns an employer given an employer name.
     * @param empName Employer name.
     * @return an employer given an employer name.
     */
    public Employer findByEmployerName(String empName);
    /**
     * Checks if the given employer already exists in the database.
     * @param employer Employer to be checked.
     * @return if the given employer already exists.
     */
    public boolean exists(Employer employer);
}
