package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3556d;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p170W2.C1837b;
import p170W2.C1839d;
import p170W2.C1841f;
import p227d3.AbstractC5225a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3686c {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private volatile AbstractC5225a zzB;
    private C1837b zzC;
    private boolean zzD;
    private volatile C3707m0 zzE;
    C3729x0 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC3698i zzn;
    private final C1841f zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC3708n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC3701j0 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C1839d[] zze = new C1839d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$a */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i7);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$b */
    public interface b {
        void onConnectionFailed(C1837b c1837b);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo17843a(C1837b c1837b);
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$d */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC3686c.c
        /* JADX INFO: renamed from: a */
        public final void mo17843a(C1837b c1837b) {
            if (c1837b.m7600X()) {
                AbstractC3686c abstractC3686c = AbstractC3686c.this;
                abstractC3686c.getRemoteService(null, abstractC3686c.getScopes());
            } else if (AbstractC3686c.this.zzx != null) {
                AbstractC3686c.this.zzx.onConnectionFailed(c1837b);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.c$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo17798a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractC3686c(Context context, Looper looper, int i7, a aVar, b bVar, String str) {
        AbstractC3698i abstractC3698iM18034a = AbstractC3698i.m18034a(context);
        C1841f c1841fM7623f = C1841f.m7623f();
        AbstractC3718s.m18083l(aVar);
        AbstractC3718s.m18083l(bVar);
        this(context, looper, abstractC3698iM18034a, c1841fM7623f, i7, aVar, bVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final void m18001c(int i7, IInterface iInterface) {
        C3729x0 c3729x0;
        AbstractC3718s.m18072a((i7 == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i7;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i7 == 1) {
                    ServiceConnectionC3701j0 serviceConnectionC3701j0 = this.zzu;
                    if (serviceConnectionC3701j0 != null) {
                        AbstractC3698i abstractC3698i = this.zzn;
                        String strM18109b = this.zza.m18109b();
                        AbstractC3718s.m18083l(strM18109b);
                        abstractC3698i.m18038e(strM18109b, this.zza.m18108a(), 4225, serviceConnectionC3701j0, zze(), this.zza.m18110c());
                        this.zzu = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    ServiceConnectionC3701j0 serviceConnectionC3701j1 = this.zzu;
                    if (serviceConnectionC3701j1 != null && (c3729x0 = this.zza) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c3729x0.m18109b() + " on " + c3729x0.m18108a());
                        AbstractC3698i abstractC3698i2 = this.zzn;
                        String strM18109b2 = this.zza.m18109b();
                        AbstractC3718s.m18083l(strM18109b2);
                        abstractC3698i2.m18038e(strM18109b2, this.zza.m18108a(), 4225, serviceConnectionC3701j1, zze(), this.zza.m18110c());
                        this.zzd.incrementAndGet();
                    }
                    ServiceConnectionC3701j0 serviceConnectionC3701j2 = new ServiceConnectionC3701j0(this, this.zzd.get());
                    this.zzu = serviceConnectionC3701j2;
                    C3729x0 c3729x1 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C3729x0(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new C3729x0(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                    this.zza = c3729x1;
                    if (c3729x1.m18110c() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m18109b())));
                    }
                    AbstractC3698i abstractC3698i3 = this.zzn;
                    String strM18109b3 = this.zza.m18109b();
                    AbstractC3718s.m18083l(strM18109b3);
                    C1837b c1837bMo18036c = abstractC3698i3.mo18036c(new C3715q0(strM18109b3, this.zza.m18108a(), 4225, this.zza.m18110c()), serviceConnectionC3701j2, zze(), getBindServiceExecutor());
                    if (!c1837bMo18036c.m7600X()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.zza.m18109b() + " on " + this.zza.m18108a());
                        int iM7596T = c1837bMo18036c.m7596T() == -1 ? 16 : c1837bMo18036c.m7596T();
                        if (c1837bMo18036c.m7598V() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, c1837bMo18036c.m7598V());
                        }
                        zzl(iM7596T, bundle, this.zzd.get());
                    }
                } else if (i7 == 4) {
                    AbstractC3718s.m18083l(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzj(AbstractC3686c abstractC3686c, C3707m0 c3707m0) {
        abstractC3686c.zzE = c3707m0;
        if (abstractC3686c.usesClientTelemetry()) {
            C3692f c3692f = c3707m0.f14810d;
            C3720t.m18089b().m18091c(c3692f == null ? null : c3692f.m18026Y());
        }
    }

    static /* bridge */ /* synthetic */ void zzk(AbstractC3686c abstractC3686c, int i7) {
        int i8;
        int i9;
        synchronized (abstractC3686c.zzp) {
            i8 = abstractC3686c.zzv;
        }
        if (i8 == 3) {
            abstractC3686c.zzD = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = abstractC3686c.zzb;
        handler.sendMessage(handler.obtainMessage(i9, abstractC3686c.zzd.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean zzn(AbstractC3686c abstractC3686c, int i7, int i8, IInterface iInterface) {
        synchronized (abstractC3686c.zzp) {
            try {
                if (abstractC3686c.zzv != i7) {
                    return false;
                }
                abstractC3686c.m18001c(i8, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzo(AbstractC3686c abstractC3686c) {
        if (abstractC3686c.zzD || TextUtils.isEmpty(abstractC3686c.getServiceDescriptor()) || TextUtils.isEmpty(abstractC3686c.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(abstractC3686c.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public void checkAvailabilityAndConnect() {
        int iMo7609h = this.zzo.mo7609h(this.zzl, getMinApkVersion());
        if (iMo7609h == 0) {
            connect(new d());
        } else {
            m18001c(1, null);
            triggerNotAvailable(new d(), iMo7609h, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        AbstractC3718s.m18084m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        m18001c(2, null);
    }

    protected abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((AbstractC3697h0) this.zzt.get(i7)).m18032d();
                }
                this.zzt.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        m18001c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        InterfaceC3708n interfaceC3708n;
        synchronized (this.zzp) {
            i7 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC3708n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i7 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i7 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i7 == 4) {
            printWriter.print("CONNECTED");
        } else if (i7 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC3708n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC3708n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j7 = this.zzh;
            printWriterAppend.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i8 = this.zzf;
            if (i8 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i8 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i8 != 3) {
                printWriter.append((CharSequence) String.valueOf(i8));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j8 = this.zzg;
            printWriterAppend2.println(j8 + " " + simpleDateFormat.format(new Date(j8)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC3556d.m17756a(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j9 = this.zzj;
            printWriterAppend3.println(j9 + " " + simpleDateFormat.format(new Date(j9)));
        }
    }

    protected boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C1839d[] getApiFeatures() {
        return zze;
    }

    public AbstractC5225a getAttributionSourceWrapper() {
        return null;
    }

    public final C1839d[] getAvailableFeatures() {
        C3707m0 c3707m0 = this.zzE;
        if (c3707m0 == null) {
            return null;
        }
        return c3707m0.f14808b;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C3729x0 c3729x0;
        if (!isConnected() || (c3729x0 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c3729x0.m18108a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C1841f.f5987a;
    }

    public void getRemoteService(InterfaceC3702k interfaceC3702k, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        String str = Build.VERSION.SDK_INT < 31 ? this.zzA : this.zzA;
        int i7 = this.zzy;
        int i8 = C1841f.f5987a;
        Scope[] scopeArr = C3694g.f14773z;
        Bundle bundle = new Bundle();
        C1839d[] c1839dArr = C3694g.f14772A;
        C3694g c3694g = new C3694g(6, i7, i8, null, null, scopeArr, bundle, null, c1839dArr, c1839dArr, true, 0, false, str);
        c3694g.f14777d = this.zzl.getPackageName();
        c3694g.f14780r = getServiceRequestExtraArgs;
        if (set != null) {
            c3694g.f14779f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c3694g.f14781s = account;
            if (interfaceC3702k != null) {
                c3694g.f14778e = interfaceC3702k.asBinder();
            }
        } else if (requiresAccount()) {
            c3694g.f14781s = getAccount();
        }
        c3694g.f14782t = zze;
        c3694g.f14783u = getApiFeatures();
        if (usesClientTelemetry()) {
            c3694g.f14786x = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC3708n interfaceC3708n = this.zzr;
                    if (interfaceC3708n != null) {
                        interfaceC3708n.mo17994r(new BinderC3699i0(this, this.zzd.get()), c3694g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            triggerConnectionSuspended(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                iInterface = this.zzs;
                AbstractC3718s.m18084m(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC3708n interfaceC3708n = this.zzr;
                if (interfaceC3708n == null) {
                    return null;
                }
                return interfaceC3708n.asBinder();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C3692f getTelemetryConfiguration() {
        C3707m0 c3707m0 = this.zzE;
        if (c3707m0 == null) {
            return null;
        }
        return c3707m0.f14810d;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z7;
        synchronized (this.zzp) {
            z7 = this.zzv == 4;
        }
        return z7;
    }

    public boolean isConnecting() {
        boolean z7;
        synchronized (this.zzp) {
            int i7 = this.zzv;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    protected void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    protected void onConnectionFailed(C1837b c1837b) {
        this.zzi = c1837b.m7596T();
        this.zzj = System.currentTimeMillis();
    }

    protected void onConnectionSuspended(int i7) {
        this.zzf = i7;
        this.zzg = System.currentTimeMillis();
    }

    protected void onPostInitHandler(int i7, IBinder iBinder, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i8, -1, new C3703k0(this, i7, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo17798a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionSourceWrapper(AbstractC5225a abstractC5225a) {
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i7) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i7));
    }

    protected void triggerNotAvailable(c cVar, int i7, PendingIntent pendingIntent) {
        AbstractC3718s.m18084m(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i7, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    protected final void zzl(int i7, Bundle bundle, int i8) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i8, -1, new C3705l0(this, i7, bundle)));
    }

    protected AbstractC3686c(Context context, Looper looper, AbstractC3698i abstractC3698i, C1841f c1841f, int i7, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzC = null;
        this.zzD = false;
        this.zzE = null;
        this.zzd = new AtomicInteger(0);
        AbstractC3718s.m18084m(context, "Context must not be null");
        this.zzl = context;
        AbstractC3718s.m18084m(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC3718s.m18084m(abstractC3698i, "Supervisor must not be null");
        this.zzn = abstractC3698i;
        AbstractC3718s.m18084m(c1841f, "API availability must not be null");
        this.zzo = c1841f;
        this.zzb = new HandlerC3695g0(this, looper);
        this.zzy = i7;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
