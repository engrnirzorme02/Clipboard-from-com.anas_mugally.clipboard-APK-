package p177X2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: renamed from: X2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1946b {

    /* JADX INFO: renamed from: X2.b$a */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* JADX INFO: renamed from: A */
    public static Double m7999A(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == 0) {
            return null;
        }
        m8012N(parcel, i7, iM8009K, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* JADX INFO: renamed from: B */
    public static float m8000B(Parcel parcel, int i7) {
        m8013O(parcel, i7, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: C */
    public static Float m8001C(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == 0) {
            return null;
        }
        m8012N(parcel, i7, iM8009K, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: renamed from: D */
    public static int m8002D(Parcel parcel) {
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: E */
    public static IBinder m8003E(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return strongBinder;
    }

    /* JADX INFO: renamed from: F */
    public static int m8004F(Parcel parcel, int i7) {
        m8013O(parcel, i7, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: G */
    public static Integer m8005G(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == 0) {
            return null;
        }
        m8012N(parcel, i7, iM8009K, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: renamed from: H */
    public static long m8006H(Parcel parcel, int i7) {
        m8013O(parcel, i7, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: I */
    public static Long m8007I(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == 0) {
            return null;
        }
        m8012N(parcel, i7, iM8009K, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* JADX INFO: renamed from: J */
    public static short m8008J(Parcel parcel, int i7) {
        m8013O(parcel, i7, 4);
        return (short) parcel.readInt();
    }

    /* JADX INFO: renamed from: K */
    public static int m8009K(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: L */
    public static void m8010L(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + m8009K(parcel, i7));
    }

    /* JADX INFO: renamed from: M */
    public static int m8011M(Parcel parcel) {
        int iM8002D = m8002D(parcel);
        int iM8009K = m8009K(parcel, iM8002D);
        int iM8036w = m8036w(iM8002D);
        int iDataPosition = parcel.dataPosition();
        if (iM8036w != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iM8002D))), parcel);
        }
        int i7 = iM8009K + iDataPosition;
        if (i7 >= iDataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i7, parcel);
    }

    /* JADX INFO: renamed from: N */
    private static void m8012N(Parcel parcel, int i7, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        throw new a("Expected size " + i9 + " got " + i8 + " (0x" + Integer.toHexString(i8) + ")", parcel);
    }

    /* JADX INFO: renamed from: O */
    private static void m8013O(Parcel parcel, int i7, int i8) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == i8) {
            return;
        }
        throw new a("Expected size " + i8 + " got " + iM8009K + " (0x" + Integer.toHexString(iM8009K) + ")", parcel);
    }

    /* JADX INFO: renamed from: a */
    public static BigDecimal m8014a(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i8 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i8);
    }

    /* JADX INFO: renamed from: b */
    public static BigDecimal[] m8015b(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        int i8 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i9] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iM8009K);
        return bigDecimalArr;
    }

    /* JADX INFO: renamed from: c */
    public static BigInteger m8016c(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return new BigInteger(bArrCreateByteArray);
    }

    /* JADX INFO: renamed from: d */
    public static BigInteger[] m8017d(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        int i8 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bigIntegerArr[i9] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iM8009K);
        return bigIntegerArr;
    }

    /* JADX INFO: renamed from: e */
    public static boolean[] m8018e(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return zArrCreateBooleanArray;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m8019f(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m8020g(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: h */
    public static byte[][] m8021h(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        int i8 = parcel.readInt();
        byte[][] bArr = new byte[i8][];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM8009K);
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public static double[] m8022i(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return dArrCreateDoubleArray;
    }

    /* JADX INFO: renamed from: j */
    public static float[] m8023j(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return fArrCreateFloatArray;
    }

    /* JADX INFO: renamed from: k */
    public static int[] m8024k(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m8025l(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = parcel.readInt();
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM8009K);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static long[] m8026m(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return jArrCreateLongArray;
    }

    /* JADX INFO: renamed from: n */
    public static Parcel m8027n(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iM8009K);
        parcel.setDataPosition(iDataPosition + iM8009K);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: o */
    public static Parcel[] m8028o(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        int i8 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = parcel.readInt();
            if (i10 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i10);
                parcelArr[i9] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i10);
            } else {
                parcelArr[i9] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iM8009K);
        return parcelArr;
    }

    /* JADX INFO: renamed from: p */
    public static Parcelable m8029p(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM8009K);
        return parcelable;
    }

    /* JADX INFO: renamed from: q */
    public static String m8030q(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return string;
    }

    /* JADX INFO: renamed from: r */
    public static String[] m8031r(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: s */
    public static ArrayList m8032s(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM8009K);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: t */
    public static Object[] m8033t(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM8009K);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: u */
    public static ArrayList m8034u(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iM8009K = m8009K(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iM8009K == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM8009K);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: v */
    public static void m8035v(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new a("Overread allowed size end=" + i7, parcel);
    }

    /* JADX INFO: renamed from: w */
    public static int m8036w(int i7) {
        return (char) i7;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m8037x(Parcel parcel, int i7) {
        m8013O(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: y */
    public static Boolean m8038y(Parcel parcel, int i7) {
        int iM8009K = m8009K(parcel, i7);
        if (iM8009K == 0) {
            return null;
        }
        m8012N(parcel, i7, iM8009K, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: renamed from: z */
    public static double m8039z(Parcel parcel, int i7) {
        m8013O(parcel, i7, 8);
        return parcel.readDouble();
    }
}
