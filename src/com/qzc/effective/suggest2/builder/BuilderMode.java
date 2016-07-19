package com.qzc.effective.suggest2.builder;

//builderģʽ
public class BuilderMode {
	private final int servingSize ;//reuqired ;no default value
	private final int servings ;//required; no default value
	private final int calories ;
	private final int fat ;
	private final int sodium ;
	private final int carbohydrate ;
	
	public static class Builder{
		
		//required parameters
		private final int servingSize ;//reuqired ;no default value
		private final int servings ;//required; no default value
		
		//optional parameters - initialized to default values;
		private int calories = 0 ;
		private int fat = 0 ;
		private int sodium = 0 ;
		private int carbohydrate = 0 ;
		
		public Builder(int servingSize,int servings){
			this.servingSize = servingSize;
			this.servings = servings;
		}
		public Builder calories(int val){
			calories = val;
			return this;
		}
		public Builder fat (int val){
			fat = val;
			return this;
		}
		public Builder sodium (int val){
			sodium = val;
			return this;
		}
		public Builder carbohydrate(int val){
			carbohydrate = val;
			return this;
		}
		public BuilderMode build(){
			return new BuilderMode(this);
		}
	}
	private BuilderMode(Builder builder){
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	public static void main(String[] args) {
		BuilderMode builderMode = new BuilderMode.Builder(240, 8)
				.calories(100).fat(20).sodium(100).carbohydrate(50)
				.build();
	}
}
