package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2804b extends IInterface {

    /* JADX INFO: renamed from: j */
    public static final String f11270j = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.b$a */
    public static abstract class a extends Binder implements InterfaceC2804b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        private static class C7674a implements InterfaceC2804b {

            /* JADX INFO: renamed from: a */
            private IBinder f11271a;

            C7674a(IBinder iBinder) {
                this.f11271a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11271a;
            }

            @Override // androidx.room.InterfaceC2804b
            /* JADX INFO: renamed from: x */
            public int mo13931x(InterfaceC2803a interfaceC2803a, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2804b.f11270j);
                    parcelObtain.writeStrongInterface(interfaceC2803a);
                    parcelObtain.writeString(str);
                    this.f11271a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC2804b
            /* JADX INFO: renamed from: z0 */
            public void mo13932z0(int i7, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2804b.f11270j);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeStringArray(strArr);
                    this.f11271a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, InterfaceC2804b.f11270j);
        }

        /* JADX INFO: renamed from: L0 */
        public static InterfaceC2804b m13936L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2804b.f11270j);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2804b)) ? new C7674a(iBinder) : (InterfaceC2804b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = InterfaceC2804b.f11270j;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 == 1) {
                int iMo13931x = mo13931x(InterfaceC2803a.a.m13935L0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo13931x);
            } else if (i7 == 2) {
                mo13930G0(InterfaceC2803a.a.m13935L0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i7 != 3) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                mo13932z0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: G0 */
    void mo13930G0(InterfaceC2803a interfaceC2803a, int i7);

    /* JADX INFO: renamed from: x */
    int mo13931x(InterfaceC2803a interfaceC2803a, String str);

    /* JADX INFO: renamed from: z0 */
    void mo13932z0(int i7, String[] strArr);
}
