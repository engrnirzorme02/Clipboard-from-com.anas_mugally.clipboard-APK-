package p163V2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p209b3.C2959a;

/* JADX INFO: renamed from: V2.x */
/* JADX INFO: loaded from: classes.dex */
final class ServiceConnectionC1753x implements ServiceConnection {

    /* JADX INFO: renamed from: c */
    C1754y f5781c;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C1725D f5784f;

    /* JADX INFO: renamed from: a */
    int f5779a = 0;

    /* JADX INFO: renamed from: b */
    final Messenger f5780b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: V2.u
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i7 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i7);
            }
            ServiceConnectionC1753x serviceConnectionC1753x = this.f5776a;
            synchronized (serviceConnectionC1753x) {
                try {
                    AbstractC1722A abstractC1722A = (AbstractC1722A) serviceConnectionC1753x.f5783e.get(i7);
                    if (abstractC1722A == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i7);
                        return true;
                    }
                    serviceConnectionC1753x.f5783e.remove(i7);
                    serviceConnectionC1753x.m7379f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC1722A.m7340c(new C1723B(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC1722A.mo7338a(data);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }));

    /* JADX INFO: renamed from: d */
    final Queue f5782d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    final SparseArray f5783e = new SparseArray();

    /* synthetic */ ServiceConnectionC1753x(C1725D c1725d, AbstractC1752w abstractC1752w) {
        this.f5784f = c1725d;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m7374a(int i7, String str) {
        m7375b(i7, str, null);
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m7375b(int i7, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i8 = this.f5779a;
            if (i8 == 0) {
                throw new IllegalStateException();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 != 3) {
                    return;
                }
                this.f5779a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f5779a = 4;
            C2959a.m14804b().m14810c(this.f5784f.f5728a, this);
            C1723B c1723b = new C1723B(i7, str, th);
            Iterator it = this.f5782d.iterator();
            while (it.hasNext()) {
                ((AbstractC1722A) it.next()).m7340c(c1723b);
            }
            this.f5782d.clear();
            for (int i9 = 0; i9 < this.f5783e.size(); i9++) {
                ((AbstractC1722A) this.f5783e.valueAt(i9)).m7340c(c1723b);
            }
            this.f5783e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    final void m7376c() {
        this.f5784f.f5729b.execute(new Runnable() { // from class: V2.r
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC1722A abstractC1722A;
                while (true) {
                    final ServiceConnectionC1753x serviceConnectionC1753x = this.f5773a;
                    synchronized (serviceConnectionC1753x) {
                        try {
                            if (serviceConnectionC1753x.f5779a != 2) {
                                return;
                            }
                            if (serviceConnectionC1753x.f5782d.isEmpty()) {
                                serviceConnectionC1753x.m7379f();
                                return;
                            } else {
                                abstractC1722A = (AbstractC1722A) serviceConnectionC1753x.f5782d.poll();
                                serviceConnectionC1753x.f5783e.put(abstractC1722A.f5723a, abstractC1722A);
                                serviceConnectionC1753x.f5784f.f5729b.schedule(new Runnable() { // from class: V2.v
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        serviceConnectionC1753x.m7378e(abstractC1722A.f5723a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC1722A)));
                    }
                    C1725D c1725d = serviceConnectionC1753x.f5784f;
                    Messenger messenger = serviceConnectionC1753x.f5780b;
                    int i7 = abstractC1722A.f5725c;
                    Context context = c1725d.f5728a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i7;
                    messageObtain.arg1 = abstractC1722A.f5723a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC1722A.mo7339b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC1722A.f5726d);
                    messageObtain.setData(bundle);
                    try {
                        serviceConnectionC1753x.f5781c.m7381a(messageObtain);
                    } catch (RemoteException e7) {
                        serviceConnectionC1753x.m7374a(2, e7.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    final synchronized void m7377d() {
        if (this.f5779a == 1) {
            m7374a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: renamed from: e */
    final synchronized void m7378e(int i7) {
        AbstractC1722A abstractC1722A = (AbstractC1722A) this.f5783e.get(i7);
        if (abstractC1722A != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i7);
            this.f5783e.remove(i7);
            abstractC1722A.m7340c(new C1723B(3, "Timed out waiting for response", null));
            m7379f();
        }
    }

    /* JADX INFO: renamed from: f */
    final synchronized void m7379f() {
        try {
            if (this.f5779a == 2 && this.f5782d.isEmpty() && this.f5783e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f5779a = 3;
                C2959a.m14804b().m14810c(this.f5784f.f5728a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    final synchronized boolean m7380g(AbstractC1722A abstractC1722A) {
        try {
            int i7 = this.f5779a;
            if (i7 != 0) {
                if (i7 == 1) {
                    this.f5782d.add(abstractC1722A);
                    return true;
                }
                if (i7 != 2) {
                    return false;
                }
                this.f5782d.add(abstractC1722A);
                m7376c();
                return true;
            }
            this.f5782d.add(abstractC1722A);
            AbstractC3718s.m18086o(this.f5779a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f5779a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (C2959a.m14804b().m14809a(this.f5784f.f5728a, intent, this, 1)) {
                    this.f5784f.f5729b.schedule(new Runnable() { // from class: V2.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5774a.m7377d();
                        }
                    }, 30L, TimeUnit.SECONDS);
                } else {
                    m7374a(0, "Unable to bind to service");
                }
            } catch (SecurityException e7) {
                m7375b(0, "Unable to bind to service", e7);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f5784f.f5729b.execute(new Runnable() { // from class: V2.q
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1753x serviceConnectionC1753x = this.f5771a;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC1753x) {
                    if (iBinder2 == null) {
                        serviceConnectionC1753x.m7374a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC1753x.f5781c = new C1754y(iBinder2);
                        serviceConnectionC1753x.f5779a = 2;
                        serviceConnectionC1753x.m7376c();
                    } catch (RemoteException e7) {
                        serviceConnectionC1753x.m7374a(0, e7.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f5784f.f5729b.execute(new Runnable() { // from class: V2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f5775a.m7374a(2, "Service disconnected");
            }
        });
    }
}
