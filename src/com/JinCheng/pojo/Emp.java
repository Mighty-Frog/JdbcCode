package com.JinCheng.pojo;

/**
 * The type Emp.
 */
public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Double Salary;

    /**
     * Instantiates a new Emp.
     *
     * @param id     the id
     * @param name   the name
     * @param job    the job
     * @param salary the salary
     */
    public Emp(Integer id, String name, String job, Double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        Salary = salary;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets job.
     *
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * Sets job.
     *
     * @param job the job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public Double getSalary() {
        return Salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(Double salary) {
        Salary = salary;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
