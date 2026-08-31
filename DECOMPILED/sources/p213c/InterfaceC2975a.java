package p213c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2975a extends IInterface {

    /* JADX INFO: renamed from: m */
    public static final String f12294m = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: c.a$a */
    public static abstract class a extends Binder implements InterfaceC2975a {

        /* JADX INFO: renamed from: c.a$a$a, reason: collision with other inner class name */
        private static class C7677a implements InterfaceC2975a {

            /* JADX INFO: renamed from: a */
            private IBinder f12295a;

            C7677a(IBinder iBinder) {
                this.f12295a = iBinder;
            }

            @Override // p213c.InterfaceC2975a
            /* JADX INFO: renamed from: C0 */
            public void mo14837C0(String str, int i7, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2975a.f12294m);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str2);
                    b.m14840b(parcelObtain, notification, 0);
                    this.f12295a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12295a;
            }
        }

        /* JADX INFO: renamed from: L0 */
        public static InterfaceC2975a m14838L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2975a.f12294m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2975a)) ? new C7677a(iBinder) : (InterfaceC2975a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.a$b */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static void m14840b(Parcel parcel, Parcelable parcelable, int i7) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i7);
            }
        }
    }

    /* JADX INFO: renamed from: C0 */
    void mo14837C0(String str, int i7, String str2, Notification notification);
}
