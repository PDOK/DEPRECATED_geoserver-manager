/*
 *  Copyright (C) 2007 - 2011 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 * 
 *  GPLv3 + Classpath exception
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geoserver.rest.encoder.coverage;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * 
 * @author Carlo Cancellieri - carlo.cancellieri@geo-solutions.it
 */
public class GSImageMosaicEncoderTest {
    private GSImageMosaicEncoder encoder;

    public GSImageMosaicEncoderTest() {
    }

    /**
     * Default logger
     */
    protected final static Logger LOGGER = LoggerFactory.getLogger(GSImageMosaicEncoderTest.class);

    @Before
    public void setUp() {
        encoder = new GSImageMosaicEncoder();
    }

    @Test
    public void testAllowMultithreading() {
        Assert.isNull(encoder.getAllowMultithreading());
        encoder.setAllowMultithreading(true);
        Assert.isTrue(encoder.getAllowMultithreading());
        encoder.setAllowMultithreading(false);
        Assert.isTrue(!encoder.getAllowMultithreading());
    }

    @Test
    public void testFilter() {
        Assert.isNull(encoder.getFilter());
        encoder.setFilter("testFilter");
        Assert.isTrue(encoder.getFilter().equals("testFilter"));
    }

    @Test
    public void testMaxAllowedTiles() {
        Assert.isNull(encoder.getMaxAllowedTiles());
        encoder.setMaxAllowedTiles(-1);
        Assert.isTrue(encoder.getMaxAllowedTiles() == -1);
    }

    @Test
    public void testInputTransparentColor() {
        Assert.isNull(encoder.getInputTransparentColor());
        encoder.setInputTransparentColor("#FFFFFF");
        Assert.isTrue(encoder.getInputTransparentColor().equals("#FFFFFF"));
    }

    @Test
    public void testOutputTransparentColor() {
        Assert.isNull(encoder.getOutputTransparentColor());
        encoder.setOutputTransparentColor("#000000");
        Assert.isTrue(encoder.getOutputTransparentColor().equals("#000000"));
    }

    @Test
    public void testSuggestedTileSize() {
        Assert.isNull(encoder.getSuggestedTileSize());
        encoder.setSUGGESTED_TILE_SIZE("512,512");
        Assert.isTrue(encoder.getSuggestedTileSize().equals("512,512"));
    }

    @Test
    public void testUseJaiImageRead() {
        Assert.isNull(encoder.getUseJaiImageRead());
        encoder.setUSE_JAI_IMAGEREAD(true);
        Assert.isTrue(encoder.getUseJaiImageRead());
        encoder.setUSE_JAI_IMAGEREAD(false);
        Assert.isTrue(!encoder.getUseJaiImageRead());
    }

    @Test
    public void testBackgroundValues() {
        Assert.isNull(encoder.getBackgroundValues());
        encoder.setBackgroundValues("testBackgroundValues");
        Assert.isTrue(encoder.getBackgroundValues().equals("testBackgroundValues"));
    }

    @Test
    public void testSorting() {
        Assert.isNull(encoder.getSorting());
        encoder.setSORTING("testSorting");
        Assert.isTrue(encoder.getSorting().equals("testSorting"));
    }

    @Test
    public void testMergeBehavior() {
        Assert.isNull(encoder.getMergeBehavior());
        encoder.setMergeBehavior("FLAT");
        Assert.isTrue(encoder.getMergeBehavior().equals("FLAT"));
    }

    @Test
    public void testAccurateResolutionComputation() {
        Assert.isNull(encoder.getAccurateResolutionComputation());
        encoder.setAccurateResolutionComputation(true);
        Assert.isTrue(encoder.getAccurateResolutionComputation());
        encoder.setAccurateResolutionComputation(false);
        Assert.isTrue(!encoder.getAccurateResolutionComputation());
    }

    @Test
    public void testFootprintBehavior() {
        Assert.isNull(encoder.getFootprintBehavior());
        encoder.setFootprintBehavior("None");
        Assert.isTrue(encoder.getFootprintBehavior().equals("None"));
    }
}
