# IT Crowd

Technologies/libraries used:

 * Lombok: getters, setters
 * Enable auditing in MongoDB: @LastModifiedDate, @CreatedDate
 * Jackson2RepositoryPopulatorFactoryBean is used to load some initial data like: Categories
 * @JsonSerialize(using = ToStringSerializer.class) to have id as string for 'ObjectId id'