package p205b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: b.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2918b extends IInterface {

    /* JADX INFO: renamed from: l */
    public static final String f12031l = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: renamed from: b.b$a */
    public static abstract class a extends Binder implements InterfaceC2918b {

        /* JADX INFO: renamed from: b.b$a$a, reason: collision with other inner class name */
        private static class C7676a implements InterfaceC2918b {

            /* JADX INFO: renamed from: a */
            private IBinder f12032a;

            C7676a(IBinder iBinder) {
                this.f12032a = iBinder;
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: F */
            public boolean mo14640F(long j7) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeLong(j7);
                    this.f12032a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: K */
            public boolean mo14641K(InterfaceC2917a interfaceC2917a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeStrongInterface(interfaceC2917a);
                    this.f12032a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: S */
            public boolean mo14642S(InterfaceC2917a interfaceC2917a, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeStrongInterface(interfaceC2917a);
                    b.m14648b(parcelObtain, uri, 0);
                    this.f12032a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12032a;
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: g0 */
            public boolean mo14643g0(InterfaceC2917a interfaceC2917a, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeStrongInterface(interfaceC2917a);
                    b.m14648b(parcelObtain, bundle, 0);
                    this.f12032a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: h */
            public boolean mo14644h(InterfaceC2917a interfaceC2917a, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeStrongInterface(interfaceC2917a);
                    b.m14648b(parcelObtain, uri, 0);
                    b.m14648b(parcelObtain, bundle, 0);
                    this.f12032a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p205b.InterfaceC2918b
            /* JADX INFO: renamed from: l */
            public int mo14645l(InterfaceC2917a interfaceC2917a, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2918b.f12031l);
                    parcelObtain.writeStrongInterface(interfaceC2917a);
                    parcelObtain.writeString(str);
                    b.m14648b(parcelObtain, bundle, 0);
                    this.f12032a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: L0 */
        public static InterfaceC2918b m14646L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2918b.f12031l);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2918b)) ? new C7676a(iBinder) : (InterfaceC2918b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: b.b$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m14648b(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    boolean mo14640F(long j7);

    /* JADX INFO: renamed from: K */
    boolean mo14641K(InterfaceC2917a interfaceC2917a);

    /* JADX INFO: renamed from: S */
    boolean mo14642S(InterfaceC2917a interfaceC2917a, Uri uri);

    /* JADX INFO: renamed from: g0 */
    boolean mo14643g0(InterfaceC2917a interfaceC2917a, Bundle bundle);

    /* JADX INFO: renamed from: h */
    boolean mo14644h(InterfaceC2917a interfaceC2917a, Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: l */
    int mo14645l(InterfaceC2917a interfaceC2917a, String str, Bundle bundle);
}
