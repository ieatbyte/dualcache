package com.vincentbrison.openlibraries.android.dualcache.lib.configurationsToTest;

import com.vincentbrison.openlibraries.android.dualcache.Builder;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheTest;
import com.vincentbrison.openlibraries.android.dualcache.lib.testobjects.AbstractVehicule;

public class RamReferenceNoDisk extends DualCacheTest {

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mCache = new Builder<>(CACHE_NAME, TEST_APP_VERSION, AbstractVehicule.class)
            .enableLog()
            .useReferenceInRam(RAM_MAX_SIZE, new SizeOfVehiculeForTesting())
            .noDisk()
            .build();
    }
}
