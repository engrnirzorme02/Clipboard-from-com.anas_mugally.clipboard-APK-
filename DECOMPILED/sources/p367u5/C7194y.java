package p367u5;

import java.math.BigDecimal;

/* JADX INFO: renamed from: u5.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7194y extends Number {

    /* JADX INFO: renamed from: a */
    private final String f28679a;

    public C7194y(String str) {
        this.f28679a = str;
    }

    /* JADX INFO: renamed from: a */
    private BigDecimal m31747a() {
        return AbstractC7162A.m31664b(this.f28679a);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f28679a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7194y) {
            return this.f28679a.equals(((C7194y) obj).f28679a);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f28679a);
    }

    public int hashCode() {
        return this.f28679a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f28679a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f28679a);
            }
        } catch (NumberFormatException unused2) {
            return m31747a().intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f28679a);
        } catch (NumberFormatException unused) {
            return m31747a().longValue();
        }
    }

    public String toString() {
        return this.f28679a;
    }
}
