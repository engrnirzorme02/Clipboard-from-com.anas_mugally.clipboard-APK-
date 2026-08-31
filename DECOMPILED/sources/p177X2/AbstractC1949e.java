package p177X2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3748c;

/* JADX INFO: renamed from: X2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1949e {
    /* JADX INFO: renamed from: a */
    public static InterfaceC1948d m8079a(byte[] bArr, Parcelable.Creator creator) {
        AbstractC3718s.m18083l(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC1948d interfaceC1948d = (InterfaceC1948d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC1948d;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC1948d m8080b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return m8079a(byteArrayExtra, creator);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1948d m8081c(String str, Parcelable.Creator creator) {
        return m8079a(AbstractC3748c.m18153a(str), creator);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m8082d(InterfaceC1948d interfaceC1948d) {
        Parcel parcelObtain = Parcel.obtain();
        interfaceC1948d.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX INFO: renamed from: e */
    public static void m8083e(InterfaceC1948d interfaceC1948d, Intent intent, String str) {
        intent.putExtra(str, m8082d(interfaceC1948d));
    }

    /* JADX INFO: renamed from: f */
    public static String m8084f(InterfaceC1948d interfaceC1948d) {
        return AbstractC3748c.m18156d(m8082d(interfaceC1948d));
    }
}
