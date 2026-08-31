package p177X2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: renamed from: X2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1947c {
    /* JADX INFO: renamed from: A */
    public static void m8040A(Parcel parcel, int i7, Parcel parcel2, boolean z7) {
        if (parcel2 == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m8041B(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcel parcel2 = (Parcel) list.get(i8);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: C */
    public static void m8042C(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m8043D(Parcel parcel, int i7, short s7) {
        m8051L(parcel, i7, 4);
        parcel.writeInt(s7);
    }

    /* JADX INFO: renamed from: E */
    public static void m8044E(Parcel parcel, int i7, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeString(str);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m8045F(Parcel parcel, int i7, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeStringArray(strArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m8046G(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeStringList(list);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m8047H(Parcel parcel, int i7, Parcelable[] parcelableArr, int i8, boolean z7) {
        if (parcelableArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m8052M(parcel, parcelable, i8);
            }
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: I */
    public static void m8048I(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            Parcelable parcelable = (Parcelable) list.get(i8);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m8052M(parcel, parcelable, 0);
            }
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: J */
    private static int m8049J(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: K */
    private static void m8050K(Parcel parcel, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: L */
    private static void m8051L(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    /* JADX INFO: renamed from: M */
    private static void m8052M(Parcel parcel, Parcelable parcelable, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: a */
    public static int m8053a(Parcel parcel) {
        return m8049J(parcel, 20293);
    }

    /* JADX INFO: renamed from: b */
    public static void m8054b(Parcel parcel, int i7) {
        m8050K(parcel, i7);
    }

    /* JADX INFO: renamed from: c */
    public static void m8055c(Parcel parcel, int i7, BigDecimal bigDecimal, boolean z7) {
        if (bigDecimal == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8056d(Parcel parcel, int i7, BigDecimal[] bigDecimalArr, boolean z7) {
        if (bigDecimalArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i8 = 0; i8 < length; i8++) {
            parcel.writeByteArray(bigDecimalArr[i8].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i8].scale());
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: e */
    public static void m8057e(Parcel parcel, int i7, BigInteger bigInteger, boolean z7) {
        if (bigInteger == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeByteArray(bigInteger.toByteArray());
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8058f(Parcel parcel, int i7, BigInteger[] bigIntegerArr, boolean z7) {
        if (bigIntegerArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: g */
    public static void m8059g(Parcel parcel, int i7, boolean z7) {
        m8051L(parcel, i7, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    /* JADX INFO: renamed from: h */
    public static void m8060h(Parcel parcel, int i7, boolean[] zArr, boolean z7) {
        if (zArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeBooleanArray(zArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8061i(Parcel parcel, int i7, Boolean bool, boolean z7) {
        if (bool != null) {
            m8051L(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            m8051L(parcel, i7, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8062j(Parcel parcel, int i7, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeBundle(bundle);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m8063k(Parcel parcel, int i7, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeByteArray(bArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m8064l(Parcel parcel, int i7, byte[][] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: m */
    public static void m8065m(Parcel parcel, int i7, double d7) {
        m8051L(parcel, i7, 8);
        parcel.writeDouble(d7);
    }

    /* JADX INFO: renamed from: n */
    public static void m8066n(Parcel parcel, int i7, double[] dArr, boolean z7) {
        if (dArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeDoubleArray(dArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m8067o(Parcel parcel, int i7, Double d7, boolean z7) {
        if (d7 != null) {
            m8051L(parcel, i7, 8);
            parcel.writeDouble(d7.doubleValue());
        } else if (z7) {
            m8051L(parcel, i7, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m8068p(Parcel parcel, int i7, float f7) {
        m8051L(parcel, i7, 4);
        parcel.writeFloat(f7);
    }

    /* JADX INFO: renamed from: q */
    public static void m8069q(Parcel parcel, int i7, float[] fArr, boolean z7) {
        if (fArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeFloatArray(fArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m8070r(Parcel parcel, int i7, Float f7, boolean z7) {
        if (f7 != null) {
            m8051L(parcel, i7, 4);
            parcel.writeFloat(f7.floatValue());
        } else if (z7) {
            m8051L(parcel, i7, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8071s(Parcel parcel, int i7, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m8072t(Parcel parcel, int i7, int i8) {
        m8051L(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    /* JADX INFO: renamed from: u */
    public static void m8073u(Parcel parcel, int i7, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeIntArray(iArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m8074v(Parcel parcel, int i7, List list, boolean z7) {
        if (list == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
                return;
            }
            return;
        }
        int iM8049J = m8049J(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(((Integer) list.get(i8)).intValue());
        }
        m8050K(parcel, iM8049J);
    }

    /* JADX INFO: renamed from: w */
    public static void m8075w(Parcel parcel, int i7, Integer num, boolean z7) {
        if (num != null) {
            m8051L(parcel, i7, 4);
            parcel.writeInt(num.intValue());
        } else if (z7) {
            m8051L(parcel, i7, 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m8076x(Parcel parcel, int i7, long j7) {
        m8051L(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    /* JADX INFO: renamed from: y */
    public static void m8077y(Parcel parcel, int i7, long[] jArr, boolean z7) {
        if (jArr == null) {
            if (z7) {
                m8051L(parcel, i7, 0);
            }
        } else {
            int iM8049J = m8049J(parcel, i7);
            parcel.writeLongArray(jArr);
            m8050K(parcel, iM8049J);
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m8078z(Parcel parcel, int i7, Long l7, boolean z7) {
        if (l7 != null) {
            m8051L(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z7) {
            m8051L(parcel, i7, 0);
        }
    }
}
