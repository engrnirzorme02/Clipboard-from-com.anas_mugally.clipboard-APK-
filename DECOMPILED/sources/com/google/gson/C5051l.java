package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import p367u5.AbstractC7162A;
import p367u5.C7194y;

/* JADX INFO: renamed from: com.google.gson.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5051l extends AbstractC5028g {

    /* JADX INFO: renamed from: a */
    private final Object f19232a;

    public C5051l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f19232a = bool;
    }

    /* JADX INFO: renamed from: z */
    private static boolean m22791z(C5051l c5051l) {
        Object obj = c5051l.f19232a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* JADX INFO: renamed from: A */
    public boolean m22792A() {
        return this.f19232a instanceof Number;
    }

    /* JADX INFO: renamed from: B */
    public boolean m22793B() {
        return this.f19232a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5051l.class != obj.getClass()) {
            return false;
        }
        C5051l c5051l = (C5051l) obj;
        if (this.f19232a == null) {
            return c5051l.f19232a == null;
        }
        if (m22791z(this) && m22791z(c5051l)) {
            if ((this.f19232a instanceof BigInteger) || (c5051l.f19232a instanceof BigInteger)) {
                return m22795p().equals(c5051l.m22795p());
            }
            return m22798w().longValue() == c5051l.m22798w().longValue();
        }
        Object obj2 = this.f19232a;
        if (obj2 instanceof Number) {
            Object obj3 = c5051l.f19232a;
            if (obj3 instanceof Number) {
                if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                    return m22794n().compareTo(c5051l.m22794n()) == 0;
                }
                double dM22797v = m22797v();
                double dM22797v2 = c5051l.m22797v();
                return dM22797v == dM22797v2 || (Double.isNaN(dM22797v) && Double.isNaN(dM22797v2));
            }
        }
        return obj2.equals(c5051l.f19232a);
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f19232a == null) {
            return 31;
        }
        if (m22791z(this)) {
            jDoubleToLongBits = m22798w().longValue();
        } else {
            Object obj = this.f19232a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m22798w().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    /* JADX INFO: renamed from: n */
    public BigDecimal m22794n() {
        Object obj = this.f19232a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : AbstractC7162A.m31664b(m22799x());
    }

    /* JADX INFO: renamed from: p */
    public BigInteger m22795p() {
        Object obj = this.f19232a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        return m22791z(this) ? BigInteger.valueOf(m22798w().longValue()) : AbstractC7162A.m31665c(m22799x());
    }

    /* JADX INFO: renamed from: q */
    public boolean m22796q() {
        return m22800y() ? ((Boolean) this.f19232a).booleanValue() : Boolean.parseBoolean(m22799x());
    }

    /* JADX INFO: renamed from: v */
    public double m22797v() {
        return m22792A() ? m22798w().doubleValue() : Double.parseDouble(m22799x());
    }

    /* JADX INFO: renamed from: w */
    public Number m22798w() {
        Object obj = this.f19232a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new C7194y((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: x */
    public String m22799x() {
        Object obj = this.f19232a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (m22792A()) {
            return m22798w().toString();
        }
        if (m22800y()) {
            return ((Boolean) this.f19232a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f19232a.getClass());
    }

    /* JADX INFO: renamed from: y */
    public boolean m22800y() {
        return this.f19232a instanceof Boolean;
    }

    public C5051l(Number number) {
        Objects.requireNonNull(number);
        this.f19232a = number;
    }

    public C5051l(String str) {
        Objects.requireNonNull(str);
        this.f19232a = str;
    }
}
