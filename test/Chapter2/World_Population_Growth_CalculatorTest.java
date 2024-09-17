package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class World_Population_Growth_CalculatorTest {

    private World_Population_Growth_Calculator population;

    @BeforeEach
    public void setUp() {
        population = new World_Population_Growth_Calculator();
    }

    @Test
    public void testPopulationWithZeroGrowthRate() {
        double CurrentPopulationRange = 8.15e9;
        double growthRate = 0.0;
        double populationEstimate = CurrentPopulationRange;
        assertEquals(populationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange, growthRate, 5),1e6);
    }

    @Test
    public void testPopulationGrowthAfterYearOne() {
        double CurrentPopulationRange = 8.15e9;
        double growthRate = 0.0091;
        double PopulationEstimate = CurrentPopulationRange * ( 1 + growthRate);
        assertEquals(PopulationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange,growthRate, 1), 1e6);
    }

    @Test
    public void testPopulationGrowthWithNegativeGrowthRate() {
        double CurrentPopulationRange = 8.15e9;
        double growthRate = -0.001;
        double populationEstimate = CurrentPopulationRange * Math.pow( 1 + growthRate, 5);
        assertEquals(populationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange,growthRate, 5), 1e6);
    }

    @Test
    public void testPopulationGrowthAfterYearTwo() {
        double CurrentPopulationRange = 8.15e9;
        double growthRate = 0.0091;
        double PopulationEstimate = CurrentPopulationRange * Math.pow( 1 + growthRate, 2);
        assertEquals(PopulationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange,growthRate, 2), 1e6);
    }

    @Test
    public void testPopulationGrowthAfterYearFive() {
        double CurrentPopulationRange = 8.15e9;
        double growthRate = 0.0091;
        double PopulationEstimate = CurrentPopulationRange * Math.pow( 1 + growthRate, 5);
        assertEquals(PopulationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange,growthRate, 5), 1e6);
    }

    @Test
    public void testLargePopulationGrowthUpToTenYears() {
        double CurrentPopulationRange = 1e12;
        double growthRate = 0.0091;
        double PopulationEstimate = CurrentPopulationRange * Math.pow( 1 + growthRate, 10);
        assertEquals(PopulationEstimate, population.estimatedPopulationGrowth(CurrentPopulationRange,growthRate, 10), 1e6);
    }

}
