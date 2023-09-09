package CollegeStudentLecturer;

public class Aktivitas {
        final static int DEFAULT_POINT = 0;
        final static String DEFAULT_ACTIVITY_NAME = "none";
        final static String DEFAULT_DATE = "January 1st 2000";
        private int point;
        private String activityName;
        private String date;
        private String month;
        private String year;

        Aktivitas() {
                this.point = DEFAULT_POINT;
                this.activityName = DEFAULT_ACTIVITY_NAME;
                this.date = DEFAULT_DATE;
        }

        Aktivitas(String activityName) {
                setActivityName(activityName);
                this.point = 1;
        }

        public void setActivityName(String activityName) {
                this.activityName = activityName;
        }

        public String getActivityName() {
                return activityName;
        }

        public void setDate(int date, int month, int year) {
                if (year>2023) {
                        this.year="2000";
                } else if (year<1970) {
                        this.year="1970";
                } else {
                        this.year=Integer.toString(year);
                }
                switch (month) {
                        case 1:
                                this.month = "January";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 2:
                                this.month = "February";
                                if (date < 1 || date > 28) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 3:
                                this.month = "March";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 4:
                                this.month = "April";
                                if (date < 1 || date > 30) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 5:
                                this.month = "May";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 6:
                                this.month = "June";
                                if (date < 1 || date > 30) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d", 
                                        date);
                                }
                                break;
                        case 7:
                                this.month = "July";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 8:
                                this.month = "August";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d", 
                                        date);
                                }
                                break;
                        case 9:
                                this.month = "September";
                                if (date < 1 || date > 30) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                         date);
                                }
                                break;
                        case 10:
                                this.month = "October";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d",
                                        date);
                                }
                                break;
                        case 11:
                                this.month = "November";
                                if (date < 1 || date > 30) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d", 
                                        date);
                                }
                                break;
                        case 12:
                                this.month = "December";
                                if (date < 1 || date > 31) {
                                        this.date = "01";
                                } else {
                                        this.date = String.format("%02d", 
                                        date);
                                }
                                break;
                        default:
                                this.month = "January";
                                this.date = "01";
                                break;
                }
        }

        public String getDate() {
                return date + " " + month + " " + year;
        }

        public int getPoint() {
                return point;
        }

        @Override
        public String toString() {
                return "Activity : " + this.activityName + " Date : " + this.date
                 + " " + this.month + " " + this.year;
        }
}
