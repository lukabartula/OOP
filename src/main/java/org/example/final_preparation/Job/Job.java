package org.example.final_preparation.Job;

class Job {
    private int year;
    @WriteFormat
    private String jobTitle;
    private String category;
    private Currency currency;
    private int salary;
    @WriteFormat
    private String residence;
    @WriteFormat
    private String experienceLevel;
    private String companyLocation;
    private String companySize;

    public Job (JobBuilder builder){
        this.year = builder.year;
        this.jobTitle = builder.jobTitle;
        this.category = builder.category;
        this.currency = builder.currency;
        this.salary = builder.salary;
        this.residence = builder.residence;
        this.experienceLevel = builder.experienceLevel;
        this.companyLocation = builder.companyLocation;
        this.companySize = builder.companySize;
    }
    static class JobBuilder{
        private int year;
        @WriteFormat
        private String jobTitle;
        private String category;
        private Currency currency;
        private int salary;
        @WriteFormat
        private String residence;
        @WriteFormat
        private String experienceLevel;
        private String companyLocation;
        private String companySize;

        public JobBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public JobBuilder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public JobBuilder setCategory(String category) {
            this.category = category;
            return this;
        }

        public JobBuilder setCurrency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public JobBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        public JobBuilder setResidence(String residence) {
            this.residence = residence;
            return this;
        }

        public JobBuilder setExperienceLevel(String experienceLevel) {
            this.experienceLevel = experienceLevel;
            return this;
        }

        public JobBuilder setCompanyLocation(String companyLocation) {
            this.companyLocation = companyLocation;
            return this;
        }

        public JobBuilder setCompanySize(String companySize) {
            this.companySize = companySize;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
