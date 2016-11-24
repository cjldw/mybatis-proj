package com.superwen.query;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/23/2016.
 */
public class Sorts {

    private String sortName;
    private String sortType;

    public Sorts() {
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public String getSortType() {
        return this.sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType.getName();
    }

    public SortType getSortType(String name) {
        for(SortType sortType: SortType.values()) {
            if(sortType.getName().contentEquals(name)) {
                return sortType;
            }
        }
        return null;
    }

    public enum SortType {

        DESC("desc"), ASC("asc");

        private String name;

        private SortType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
