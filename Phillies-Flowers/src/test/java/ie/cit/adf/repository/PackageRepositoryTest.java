package ie.cit.adf.repository;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import ie.cit.adf.domain.Package;

@RunWith(SpringRunner.class)
public class PackageRepositoryTest {
	
	@Autowired
	private IPackageRepository repository;
	
	private int id = 1;
	
	@Test
	public void deletePackageById() {
		//Arrange
		Package Package = repository.findOne(id);

		//Act
		repository.delete(Package.getId());
		
		//Assert
		Assert.assertNull("Package is not deleted", Package);
	}
	
	
	@Test
	public void addPackage() {
		//Arrange
		Package PackageToAdd = new Package();
		
		PackageToAdd.setPackageName("Test");
		PackageToAdd.setDescription("A Package to test.");
		
		//Act
		repository.save(PackageToAdd);
		
		//Assert
		Assert.assertNotEquals("Package not added, no ID returned.", null, PackageToAdd.getId());	
	}
	
	
	@Test
	public void getPackageById() {
		//Arrange
		//Act
		Package Package = repository.findOne(id);
		
		//Assert
		Assert.assertEquals("Package ID not found.", id, Package.getId());
	}
	
	@Test
	public void getAllPackages() {
		//Arrange
		//Act
		ArrayList<Package> allPackages = (ArrayList<Package>)repository.findAll();
		
		//Assert
		Assert.assertTrue("No Packages Returned.", (allPackages.size() > 0));
	}
	
	@Test
	public void editPackageDescription(){
		
		//Arrange
		String description = "Description";
		Package PackageToEdit = repository.findOne(id);
		//Act
		repository.editPackageDescription(PackageToEdit.getId(), description);
		//Assert
		Assert.assertEquals("Description has not been edited.", PackageToEdit.getDescription(), description);
	}
}
