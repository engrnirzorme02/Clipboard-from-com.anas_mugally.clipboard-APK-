package p170W2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: W2.a */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC1836a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    boolean f5970a = false;

    /* JADX INFO: renamed from: b */
    private final BlockingQueue f5971b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: a */
    public IBinder m7594a(long j7, TimeUnit timeUnit) throws TimeoutException {
        AbstractC3718s.m18082k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f5970a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f5970a = true;
        IBinder iBinder = (IBinder) this.f5971b.poll(j7, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5971b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
