package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2803a extends IInterface {

    /* JADX INFO: renamed from: i */
    public static final String f11268i = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.a$a */
    public static abstract class a extends Binder implements InterfaceC2803a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        private static class C7673a implements InterfaceC2803a {

            /* JADX INFO: renamed from: a */
            private IBinder f11269a;

            C7673a(IBinder iBinder) {
                this.f11269a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f11269a;
            }

            @Override // androidx.room.InterfaceC2803a
            /* JADX INFO: renamed from: p */
            public void mo13934p(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2803a.f11268i);
                    parcelObtain.writeStringArray(strArr);
                    this.f11269a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, InterfaceC2803a.f11268i);
        }

        /* JADX INFO: renamed from: L0 */
        public static InterfaceC2803a m13935L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2803a.f11268i);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2803a)) ? new C7673a(iBinder) : (InterfaceC2803a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            String str = InterfaceC2803a.f11268i;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            mo13934p(parcel.createStringArray());
            return true;
        }
    }

    /* JADX INFO: renamed from: p */
    void mo13934p(String[] strArr);
}
