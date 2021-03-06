/* Copyright (c) 2014 OpenJAX
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * You should have received a copy of The MIT License (MIT) along with this
 * program. If not, see <http://opensource.org/licenses/MIT/>.
 */

package org.openjax.measure;

/**
 * A scalar dimension representing elevation.
 */
public final class Elevation extends Dimension.Scalar<Dimension.Unit> {
  public static class Unit extends Distance.Unit {
    public static final Unit FL = new Unit("fl", 100, Unit.FT);

    protected Unit(final String name, final double factor, final Distance.Unit basis) {
      super(name, factor, basis);
    }
  }

  public Elevation(final double value, final Distance.Unit unit) {
    super(value, unit);
  }
}