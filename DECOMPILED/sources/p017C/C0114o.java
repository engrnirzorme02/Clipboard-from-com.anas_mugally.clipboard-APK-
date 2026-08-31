package p017C;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p213c.InterfaceC2975a;

/* JADX INFO: renamed from: C.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0114o {

    /* JADX INFO: renamed from: d */
    private static String f638d;

    /* JADX INFO: renamed from: g */
    private static d f641g;

    /* JADX INFO: renamed from: a */
    private final Context f642a;

    /* JADX INFO: renamed from: b */
    private final NotificationManager f643b;

    /* JADX INFO: renamed from: c */
    private static final Object f637c = new Object();

    /* JADX INFO: renamed from: e */
    private static Set f639e = new HashSet();

    /* JADX INFO: renamed from: f */
    private static final Object f640f = new Object();

    /* JADX INFO: renamed from: C.o$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static boolean m547a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    /* JADX INFO: renamed from: C.o$b */
    private static class b implements e {

        /* JADX INFO: renamed from: a */
        final String f644a;

        /* JADX INFO: renamed from: b */
        final int f645b;

        /* JADX INFO: renamed from: c */
        final String f646c;

        /* JADX INFO: renamed from: d */
        final Notification f647d;

        b(String str, int i7, String str2, Notification notification) {
            this.f644a = str;
            this.f645b = i7;
            this.f646c = str2;
            this.f647d = notification;
        }

        @Override // p017C.C0114o.e
        /* JADX INFO: renamed from: a */
        public void mo548a(InterfaceC2975a interfaceC2975a) {
            interfaceC2975a.mo14837C0(this.f644a, this.f645b, this.f646c, this.f647d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f644a + ", id:" + this.f645b + ", tag:" + this.f646c + "]";
        }
    }

    /* JADX INFO: renamed from: C.o$c */
    private static class c {

        /* JADX INFO: renamed from: a */
        final ComponentName f648a;

        /* JADX INFO: renamed from: b */
        final IBinder f649b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f648a = componentName;
            this.f649b = iBinder;
        }
    }

    /* JADX INFO: renamed from: C.o$d */
    private static class d implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a */
        private final Context f650a;

        /* JADX INFO: renamed from: b */
        private final HandlerThread f651b;

        /* JADX INFO: renamed from: c */
        private final Handler f652c;

        /* JADX INFO: renamed from: d */
        private final Map f653d = new HashMap();

        /* JADX INFO: renamed from: e */
        private Set f654e = new HashSet();

        /* JADX INFO: renamed from: C.o$d$a */
        private static class a {

            /* JADX INFO: renamed from: a */
            final ComponentName f655a;

            /* JADX INFO: renamed from: c */
            InterfaceC2975a f657c;

            /* JADX INFO: renamed from: b */
            boolean f656b = false;

            /* JADX INFO: renamed from: d */
            ArrayDeque f658d = new ArrayDeque();

            /* JADX INFO: renamed from: e */
            int f659e = 0;

            a(ComponentName componentName) {
                this.f655a = componentName;
            }
        }

        d(Context context) {
            this.f650a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f651b = handlerThread;
            handlerThread.start();
            this.f652c = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX INFO: renamed from: a */
        private boolean m549a(a aVar) {
            if (aVar.f656b) {
                return true;
            }
            boolean zBindService = this.f650a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f655a), this, 33);
            aVar.f656b = zBindService;
            if (zBindService) {
                aVar.f659e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f655a);
                this.f650a.unbindService(this);
            }
            return aVar.f656b;
        }

        /* JADX INFO: renamed from: b */
        private void m550b(a aVar) {
            if (aVar.f656b) {
                this.f650a.unbindService(this);
                aVar.f656b = false;
            }
            aVar.f657c = null;
        }

        /* JADX INFO: renamed from: c */
        private void m551c(e eVar) {
            m557j();
            for (a aVar : this.f653d.values()) {
                aVar.f658d.add(eVar);
                m555g(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        private void m552d(ComponentName componentName) {
            a aVar = (a) this.f653d.get(componentName);
            if (aVar != null) {
                m555g(aVar);
            }
        }

        /* JADX INFO: renamed from: e */
        private void m553e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f653d.get(componentName);
            if (aVar != null) {
                aVar.f657c = InterfaceC2975a.a.m14838L0(iBinder);
                aVar.f659e = 0;
                m555g(aVar);
            }
        }

        /* JADX INFO: renamed from: f */
        private void m554f(ComponentName componentName) {
            a aVar = (a) this.f653d.get(componentName);
            if (aVar != null) {
                m550b(aVar);
            }
        }

        /* JADX INFO: renamed from: g */
        private void m555g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f655a + ", " + aVar.f658d.size() + " queued tasks");
            }
            if (aVar.f658d.isEmpty()) {
                return;
            }
            if (!m549a(aVar) || aVar.f657c == null) {
                m556i(aVar);
                return;
            }
            while (true) {
                e eVar = (e) aVar.f658d.peek();
                if (eVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + eVar);
                    }
                    eVar.mo548a(aVar.f657c);
                    aVar.f658d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f655a);
                    }
                } catch (RemoteException e7) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f655a, e7);
                }
            }
            if (aVar.f658d.isEmpty()) {
                return;
            }
            m556i(aVar);
        }

        /* JADX INFO: renamed from: i */
        private void m556i(a aVar) {
            if (this.f652c.hasMessages(3, aVar.f655a)) {
                return;
            }
            int i7 = aVar.f659e;
            int i8 = i7 + 1;
            aVar.f659e = i8;
            if (i8 <= 6) {
                int i9 = (1 << i7) * zzbbn.zzq.zzf;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
                }
                this.f652c.sendMessageDelayed(this.f652c.obtainMessage(3, aVar.f655a), i9);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f658d.size() + " tasks to " + aVar.f655a + " after " + aVar.f659e + " retries");
            aVar.f658d.clear();
        }

        /* JADX INFO: renamed from: j */
        private void m557j() {
            Set setM541c = C0114o.m541c(this.f650a);
            if (setM541c.equals(this.f654e)) {
                return;
            }
            this.f654e = setM541c;
            List<ResolveInfo> listQueryIntentServices = this.f650a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM541c.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f653d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f653d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f653d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    m550b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m558h(e eVar) {
            this.f652c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i7 = message.what;
            if (i7 == 0) {
                m551c((e) message.obj);
                return true;
            }
            if (i7 == 1) {
                c cVar = (c) message.obj;
                m553e(cVar.f648a, cVar.f649b);
                return true;
            }
            if (i7 == 2) {
                m554f((ComponentName) message.obj);
                return true;
            }
            if (i7 != 3) {
                return false;
            }
            m552d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f652c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f652c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: C.o$e */
    private interface e {
        /* JADX INFO: renamed from: a */
        void mo548a(InterfaceC2975a interfaceC2975a);
    }

    private C0114o(Context context) {
        this.f642a = context;
        this.f643b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: b */
    public static C0114o m540b(Context context) {
        return new C0114o(context);
    }

    /* JADX INFO: renamed from: c */
    public static Set m541c(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f637c) {
            if (string != null) {
                try {
                    if (!string.equals(f638d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f639e = hashSet;
                        f638d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f639e;
        }
        return set;
    }

    /* JADX INFO: renamed from: f */
    private void m542f(e eVar) {
        synchronized (f640f) {
            try {
                if (f641g == null) {
                    f641g = new d(this.f642a.getApplicationContext());
                }
                f641g.m558h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m543g(Notification notification) {
        Bundle bundleM432a = AbstractC0111l.m432a(notification);
        return bundleM432a != null && bundleM432a.getBoolean("android.support.useSideChannel");
    }

    /* JADX INFO: renamed from: a */
    public boolean m544a() {
        return a.m547a(this.f643b);
    }

    /* JADX INFO: renamed from: d */
    public void m545d(int i7, Notification notification) {
        m546e(null, i7, notification);
    }

    /* JADX INFO: renamed from: e */
    public void m546e(String str, int i7, Notification notification) {
        if (!m543g(notification)) {
            this.f643b.notify(str, i7, notification);
        } else {
            m542f(new b(this.f642a.getPackageName(), i7, str, notification));
            this.f643b.cancel(str, i7);
        }
    }
}
