package p205b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2917a extends IInterface {

    /* JADX INFO: renamed from: k */
    public static final String f12030k = "android$support$customtabs$ICustomTabsCallback".replace('$', '.');

    /* JADX INFO: renamed from: b.a$a */
    public static abstract class a extends Binder implements InterfaceC2917a {
        public a() {
            attachInterface(this, InterfaceC2917a.f12030k);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = InterfaceC2917a.f12030k;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i7) {
                case 2:
                    mo10198l0(parcel.readInt(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    mo10196d0(parcel.readString(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    mo10191B0((Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    mo10200w0(parcel.readString(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    mo10192D0(parcel.readInt(), (Uri) b.m14638c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleMo10190B = mo10190B(parcel.readString(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.m14639d(parcel2, bundleMo10190B, 1);
                    return true;
                case 8:
                    mo10195U(parcel.readInt(), parcel.readInt(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    mo10197h0((Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    mo10199o(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    mo10193J((Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    mo10194M((Bundle) b.m14638c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }
    }

    /* JADX INFO: renamed from: b.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static Object m14638c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static void m14639d(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    Bundle mo10190B(String str, Bundle bundle);

    /* JADX INFO: renamed from: B0 */
    void mo10191B0(Bundle bundle);

    /* JADX INFO: renamed from: D0 */
    void mo10192D0(int i7, Uri uri, boolean z7, Bundle bundle);

    /* JADX INFO: renamed from: J */
    void mo10193J(Bundle bundle);

    /* JADX INFO: renamed from: M */
    void mo10194M(Bundle bundle);

    /* JADX INFO: renamed from: U */
    void mo10195U(int i7, int i8, Bundle bundle);

    /* JADX INFO: renamed from: d0 */
    void mo10196d0(String str, Bundle bundle);

    /* JADX INFO: renamed from: h0 */
    void mo10197h0(Bundle bundle);

    /* JADX INFO: renamed from: l0 */
    void mo10198l0(int i7, Bundle bundle);

    /* JADX INFO: renamed from: o */
    void mo10199o(int i7, int i8, int i9, int i10, int i11, Bundle bundle);

    /* JADX INFO: renamed from: w0 */
    void mo10200w0(String str, Bundle bundle);
}
