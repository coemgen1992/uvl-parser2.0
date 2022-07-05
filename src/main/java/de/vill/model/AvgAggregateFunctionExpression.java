package de.vill.model;

public class AvgAggregateFunctionExpression extends Expression{
    public String getRootFeature() {
        return rootFeature;
    }

    public String getAttributeName() {
        return attributeName;
    }

    private String rootFeature;
    private String attributeName;

    public AvgAggregateFunctionExpression(String attributeName){
        this.attributeName = attributeName;
    }
    public AvgAggregateFunctionExpression(String rootFeature, String attributeName){
        this(attributeName);
        this.rootFeature = rootFeature;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("avg(");
        if(getRootFeature() != null){
            result.append(getRootFeature());
            result.append(", ");
        }
        result.append(getAttributeName());
        result.append(")");
        return result.toString();
    }
}
