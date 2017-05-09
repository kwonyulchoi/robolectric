package org.robolectric.shadows;

import android.graphics.Region;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.annotation.HiddenApi;

@Implements(Region.class)
public class ShadowRegion {
  public static int nextId = 1;

  @HiddenApi @Implementation
  protected static int nativeConstructor() {
    return nextId++;
  }
}
