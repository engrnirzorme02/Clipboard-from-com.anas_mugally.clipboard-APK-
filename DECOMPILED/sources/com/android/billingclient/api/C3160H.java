package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.android.billingclient.api.C3178d;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.android.gms.internal.play_billing.zzr;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p104N.InterfaceC0904a;
import p403z1.C7559a;
import p403z1.InterfaceC7560b;
import p403z1.InterfaceC7562d;
import p403z1.InterfaceC7564f;
import p403z1.InterfaceC7566h;
import p403z1.InterfaceC7571m;
import p403z1.InterfaceC7578t;

/* JADX INFO: renamed from: com.android.billingclient.api.H */
/* JADX INFO: loaded from: classes.dex */
final class C3160H extends C3176b {

    /* JADX INFO: renamed from: K */
    private final Context f13420K;

    /* JADX INFO: renamed from: L */
    private volatile int f13421L;

    /* JADX INFO: renamed from: M */
    private volatile zzau f13422M;

    /* JADX INFO: renamed from: N */
    private volatile ServiceConnectionC3159G f13423N;

    /* JADX INFO: renamed from: O */
    private volatile ScheduledExecutorService f13424O;

    C3160H(String str, Context context, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        super(null, context, null, null, aVar);
        this.f13421L = 0;
        this.f13420K = context;
    }

    /* JADX INFO: renamed from: D0 */
    private final synchronized void m16736D0() {
        if (m16756R0()) {
            zzc.zzm("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
            m16741I0(26);
            return;
        }
        if (this.f13421L == 1) {
            zzc.zzn("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
            return;
        }
        if (this.f13421L == 3) {
            zzc.zzn("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
            m16740H0(zzie.BILLING_CLIENT_CLOSED, 26, AbstractC3163K.m16775a(-1, "Billing Override Service connection is disconnected."));
            return;
        }
        this.f13421L = 1;
        zzc.zzm("BillingClientTesting", "Starting Billing Override Service setup.");
        this.f13423N = new ServiceConnectionC3159G(this, null);
        Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
        intent.setPackage("com.google.android.apps.play.billingtestcompanion");
        Context context = this.f13420K;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        zzie zzieVar = zzie.REASON_UNSPECIFIED;
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            zzieVar = zzie.INTENT_SERVICE_NOT_FOUND;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                    zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                    zzc.zzn("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    if (context.bindService(intent2, this.f13423N, 1)) {
                        zzc.zzm("BillingClientTesting", "Billing Override Service was bonded successfully.");
                        return;
                    } else {
                        zzieVar = zzie.BILLING_SERVICE_BLOCKED;
                        zzc.zzn("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                    }
                }
            }
        }
        this.f13421L = 0;
        zzc.zzm("BillingClientTesting", "Billing Override Service unavailable on device.");
        m16740H0(zzieVar, 26, AbstractC3163K.m16775a(2, "Billing Override Service unavailable on device."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final boolean m16737E0(int i7) {
        return i7 > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final C3178d m16738F0(int i7, int i8) {
        C3178d c3178dM16775a = AbstractC3163K.m16775a(i8, "Billing override value was set by a license tester.");
        m16740H0(zzie.LICENSE_TESTER_BILLING_OVERRIDE, i7, c3178dM16775a);
        return c3178dM16775a;
    }

    /* JADX INFO: renamed from: G0 */
    private final zzcz m16739G0(final int i7) {
        if (m16756R0()) {
            return zzu.zza(new zzr() { // from class: com.android.billingclient.api.A
                @Override // com.google.android.gms.internal.play_billing.zzr
                public final Object zza(zzp zzpVar) {
                    return C3160H.m16751T0(this.f13405a, i7, zzpVar);
                }
            });
        }
        zzc.zzn("BillingClientTesting", "Billing Override Service is not ready.");
        m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CONNECTION_NOT_READY, 28, AbstractC3163K.m16775a(-1, "Billing Override Service connection is disconnected."));
        return zzcu.zza(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m16740H0(zzie zzieVar, int i7, C3178d c3178d) {
        int i8 = AbstractC3161I.f13425a;
        zzhx zzhxVarM16762b = AbstractC3161I.m16762b(zzieVar, i7, c3178d, null, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzhxVarM16762b, "ApiFailure should not be null");
        m16881q0().mo16765b(zzhxVarM16762b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final void m16741I0(int i7) {
        int i8 = AbstractC3161I.f13425a;
        zzib zzibVarM16763c = AbstractC3161I.m16763c(i7, zzil.BROADCAST_ACTION_UNSPECIFIED);
        Objects.requireNonNull(zzibVarM16763c, "ApiSuccess should not be null");
        m16881q0().mo16771h(zzibVarM16763c);
    }

    /* JADX INFO: renamed from: J0 */
    private final void m16742J0(int i7, InterfaceC0904a interfaceC0904a, Runnable runnable) {
        zzcu.zzc(zzcu.zzb(m16739G0(i7), 28500L, TimeUnit.MILLISECONDS, m16755X0()), new C3157E(this, i7, interfaceC0904a, runnable), m16879i());
    }

    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ Object m16751T0(C3160H c3160h, int i7, zzp zzpVar) {
        String str;
        try {
            if (c3160h.f13422M == null) {
                throw null;
            }
            zzau zzauVar = c3160h.f13422M;
            String packageName = c3160h.f13420K.getPackageName();
            if (i7 == 2) {
                str = "LAUNCH_BILLING_FLOW";
            } else if (i7 == 3) {
                str = "ACKNOWLEDGE_PURCHASE";
            } else if (i7 == 4) {
                str = "CONSUME_ASYNC";
            } else if (i7 != 5) {
                str = i7 != 6 ? "QUERY_PRODUCT_DETAILS_ASYNC" : "START_CONNECTION";
            } else {
                str = "IS_FEATURE_SUPPORTED";
            }
            zzauVar.zza(packageName, str, new BinderC3158F(zzpVar));
            return "billingOverrideService.getBillingOverride";
        } catch (Exception e7) {
            c3160h.m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, AbstractC3163K.f13432F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
            zzpVar.zzb(0);
            return "billingOverrideService.getBillingOverride";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    private final int m16754W0(zzcz zzczVar) {
        try {
            return ((Integer) zzczVar.get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e7) {
            m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT, 28, AbstractC3163K.f13432F);
            zzc.zzo("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e7);
            return 0;
        } catch (Exception e8) {
            if (e8 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            m16740H0(zzie.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION, 28, AbstractC3163K.f13432F);
            zzc.zzo("BillingClientTesting", "An error occurred while retrieving billing override.", e8);
            return 0;
        }
    }

    /* JADX INFO: renamed from: X0 */
    private final synchronized ScheduledExecutorService m16755X0() {
        try {
            if (this.f13424O == null) {
                this.f13424O = Executors.newSingleThreadScheduledExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13424O;
    }

    /* JADX INFO: renamed from: R0 */
    public final synchronized boolean m16756R0() {
        return (this.f13421L != 2 || this.f13422M == null || this.f13423N == null) ? false : true;
    }

    @Override // com.android.billingclient.api.C3176b, com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: a */
    public final void mo16757a(final C7559a c7559a, final InterfaceC7560b interfaceC7560b) {
        Objects.requireNonNull(interfaceC7560b);
        m16742J0(3, new InterfaceC0904a() { // from class: z1.o
            @Override // p104N.InterfaceC0904a
            public final void accept(Object obj) {
                interfaceC7560b.mo16408a((C3178d) obj);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.B
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.mo16757a(c7559a, interfaceC7560b);
            }
        });
    }

    @Override // com.android.billingclient.api.C3176b, com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: c */
    public final C3178d mo16758c(final Activity activity, final C3177c c3177c) {
        InterfaceC0904a interfaceC0904a = new InterfaceC0904a() { // from class: com.android.billingclient.api.C
            @Override // p104N.InterfaceC0904a
            public final void accept(Object obj) {
                super/*com.android.billingclient.api.b*/.m16882t0((C3178d) obj);
            }
        };
        Callable callable = new Callable() { // from class: com.android.billingclient.api.D
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return super/*com.android.billingclient.api.b*/.mo16758c(activity, c3177c);
            }
        };
        int iM16754W0 = m16754W0(m16739G0(2));
        if (m16737E0(iM16754W0)) {
            C3178d c3178dM16738F0 = m16738F0(2, iM16754W0);
            interfaceC0904a.accept(c3178dM16738F0);
            return c3178dM16738F0;
        }
        try {
            return (C3178d) callable.call();
        } catch (Exception e7) {
            zzie zzieVar = zzie.BILLING_OVERRIDE_SERVICE_FALLBACK_ERROR;
            C3178d c3178d = AbstractC3163K.f13440h;
            m16740H0(zzieVar, 2, c3178d);
            zzc.zzo("BillingClientTesting", "An internal error occurred.", e7);
            return c3178d;
        }
    }

    @Override // com.android.billingclient.api.C3176b, com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: e */
    public final void mo16759e(final C3181g c3181g, final InterfaceC7564f interfaceC7564f) {
        m16742J0(7, new InterfaceC0904a() { // from class: com.android.billingclient.api.y
            @Override // p104N.InterfaceC0904a
            public final void accept(Object obj) {
                C3182h c3182h = new C3182h(new ArrayList(), new ArrayList());
                interfaceC7564f.mo24531a((C3178d) obj, c3182h);
            }
        }, new Runnable() { // from class: com.android.billingclient.api.z
            @Override // java.lang.Runnable
            public final void run() {
                super/*com.android.billingclient.api.b*/.mo16759e(c3181g, interfaceC7564f);
            }
        });
    }

    @Override // com.android.billingclient.api.C3176b, com.android.billingclient.api.AbstractC3175a
    /* JADX INFO: renamed from: g */
    public final void mo16760g(InterfaceC7562d interfaceC7562d) {
        m16736D0();
        super.mo16760g(interfaceC7562d);
    }

    C3160H(String str, C3179e c3179e, Context context, InterfaceC7578t interfaceC7578t, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        super(null, c3179e, context, null, null, null, aVar);
        this.f13421L = 0;
        this.f13420K = context;
    }

    C3160H(String str, C3179e c3179e, Context context, InterfaceC7566h interfaceC7566h, InterfaceC7571m interfaceC7571m, InterfaceC3162J interfaceC3162J, ExecutorService executorService, AbstractC3175a.a aVar) {
        super(null, c3179e, context, interfaceC7566h, null, null, null, aVar);
        this.f13421L = 0;
        this.f13420K = context;
    }
}
