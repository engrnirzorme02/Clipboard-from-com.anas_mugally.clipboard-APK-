package p163V2;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: V2.y */
/* JADX INFO: loaded from: classes.dex */
final class C1754y {

    /* JADX INFO: renamed from: a */
    private final Messenger f5785a;

    /* JADX INFO: renamed from: b */
    private final C1741l f5786b;

    C1754y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f5785a = new Messenger(iBinder);
            this.f5786b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f5786b = new C1741l(iBinder);
            this.f5785a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    final void m7381a(Message message) throws RemoteException {
        Messenger messenger = this.f5785a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C1741l c1741l = this.f5786b;
        if (c1741l == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c1741l.m7373b(message);
    }
}
