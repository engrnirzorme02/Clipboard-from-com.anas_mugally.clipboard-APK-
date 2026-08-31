package p163V2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: V2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1741l implements Parcelable {
    public static final Parcelable.Creator<C1741l> CREATOR = new C1739j();

    /* JADX INFO: renamed from: a */
    Messenger f5760a;

    public C1741l(IBinder iBinder) {
        this.f5760a = new Messenger(iBinder);
    }

    /* JADX INFO: renamed from: a */
    public final IBinder m7372a() {
        Messenger messenger = this.f5760a;
        messenger.getClass();
        return messenger.getBinder();
    }

    /* JADX INFO: renamed from: b */
    public final void m7373b(Message message) throws RemoteException {
        Messenger messenger = this.f5760a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m7372a().equals(((C1741l) obj).m7372a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return m7372a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f5760a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
