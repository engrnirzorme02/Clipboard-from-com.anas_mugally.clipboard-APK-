package p380w2;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3244B;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzaui;
import com.google.android.gms.internal.ads.zzaum;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzgot;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p404z2.AbstractC7599p;
import p404z2.C7584a;
import p404z2.C7590g;

/* JADX INFO: renamed from: w2.k */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7342k implements Runnable, zzaup {

    /* JADX INFO: renamed from: A */
    private static final long f29204A = System.currentTimeMillis();

    /* JADX INFO: renamed from: d */
    protected boolean f29208d;

    /* JADX INFO: renamed from: e */
    private final boolean f29209e;

    /* JADX INFO: renamed from: f */
    private final boolean f29210f;

    /* JADX INFO: renamed from: r */
    private final Executor f29211r;

    /* JADX INFO: renamed from: s */
    private final zzfoh f29212s;

    /* JADX INFO: renamed from: t */
    private Context f29213t;

    /* JADX INFO: renamed from: u */
    private final Context f29214u;

    /* JADX INFO: renamed from: v */
    private C7584a f29215v;

    /* JADX INFO: renamed from: w */
    private final C7584a f29216w;

    /* JADX INFO: renamed from: x */
    private final boolean f29217x;

    /* JADX INFO: renamed from: z */
    private int f29219z;

    /* JADX INFO: renamed from: a */
    private final List f29205a = new Vector();

    /* JADX INFO: renamed from: b */
    private final AtomicReference f29206b = new AtomicReference();

    /* JADX INFO: renamed from: c */
    private final AtomicReference f29207c = new AtomicReference();

    /* JADX INFO: renamed from: y */
    final CountDownLatch f29218y = new CountDownLatch(1);

    public RunnableC7342k(Context context, C7584a c7584a) {
        this.f29213t = context;
        this.f29214u = context;
        this.f29215v = c7584a;
        this.f29216w = c7584a;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f29211r = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcJ)).booleanValue();
        this.f29217x = zBooleanValue;
        this.f29212s = zzfoh.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f29209e = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcG)).booleanValue();
        this.f29210f = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcK)).booleanValue();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcI)).booleanValue()) {
            this.f29219z = 2;
        } else {
            this.f29219z = 1;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdS)).booleanValue()) {
            this.f29208d = m32322d();
        }
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdL)).booleanValue()) {
            zzbzh.zza.execute(this);
            return;
        }
        C3244B.m17190a();
        if (C7590g.m33273C()) {
            zzbzh.zza.execute(this);
        } else {
            run();
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m32314h() {
        List<Object[]> list = this.f29205a;
        zzaup zzaupVarM32316j = m32316j();
        if (list.isEmpty() || zzaupVarM32316j == null) {
            return;
        }
        for (Object[] objArr : list) {
            int length = objArr.length;
            if (length == 1) {
                zzaupVarM32316j.zzd((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzaupVarM32316j.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        list.clear();
    }

    /* JADX INFO: renamed from: i */
    private final void m32315i(boolean z7) {
        String str = this.f29215v.f30226a;
        Context contextM32317k = m32317k(this.f29213t);
        zzaqx zzaqxVarZze = zzaqy.zze();
        zzaqxVarZze.zzb(z7);
        zzaqxVarZze.zza(str);
        this.f29206b.set(zzaut.zzt(contextM32317k, (zzaqy) zzaqxVarZze.zzbu()));
    }

    /* JADX INFO: renamed from: j */
    private final zzaup m32316j() {
        return m32325g() == 2 ? (zzaup) this.f29207c.get() : (zzaup) this.f29206b.get();
    }

    /* JADX INFO: renamed from: k */
    private static final Context m32317k(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX INFO: renamed from: l */
    private static final zzaum m32318l(Context context, C7584a c7584a, boolean z7, boolean z8) {
        zzaqx zzaqxVarZze = zzaqy.zze();
        zzaqxVarZze.zzb(z7);
        zzaqxVarZze.zza(c7584a.f30226a);
        return zzaum.zza(m32317k(context), (zzaqy) zzaqxVarZze.zzbu(), z8);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m32319a() {
        try {
            this.f29218y.await();
            return true;
        } catch (InterruptedException e7) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Interrupted during GADSignals creation.", e7);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m32320b(Context context, byte[] bArr) {
        zzaup zzaupVarM32316j;
        if (!m32319a() || (zzaupVarM32316j = m32316j()) == null) {
            return "";
        }
        m32314h();
        return zzaupVarM32316j.zzl(m32317k(context));
    }

    /* JADX INFO: renamed from: c */
    public final String m32321c() {
        int i7 = this.f29219z;
        int i8 = i7 - 1;
        if (i7 != 0) {
            return i8 != 0 ? "2" : "1";
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    protected final boolean m32322d() {
        Context context = this.f29213t;
        C7339h c7339h = new C7339h(this);
        zzfoh zzfohVar = this.f29212s;
        return new zzfpy(this.f29213t, zzfpe.zzb(context, zzfohVar), c7339h, ((Boolean) C3250D.m17200c().zzd(zzbci.zzcH)).booleanValue()).zzd(1);
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ void m32323e(boolean z7) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            m32318l(this.f29214u, this.f29216w, z7, this.f29217x).zzm();
        } catch (NullPointerException e7) {
            this.f29212s.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e7);
        }
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ zzfoh m32324f() {
        return this.f29212s;
    }

    /* JADX INFO: renamed from: g */
    protected final int m32325g() {
        if (!this.f29209e || this.f29208d) {
            return this.f29219z;
        }
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdS)).booleanValue()) {
                this.f29208d = m32322d();
            }
            boolean z7 = this.f29215v.f30229d;
            final boolean z8 = false;
            if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzbk)).booleanValue() && z7) {
                z8 = true;
            }
            if (m32325g() == 1) {
                m32315i(z8);
                if (this.f29219z == 2) {
                    this.f29211r.execute(new Runnable() { // from class: w2.i
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f29200a.m32323e(z8);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaum zzaumVarM32318l = m32318l(this.f29213t, this.f29215v, z8, this.f29217x);
                    this.f29207c.set(zzaumVarM32318l);
                    if (this.f29210f && !zzaumVarM32318l.zzb()) {
                        this.f29219z = 1;
                        m32315i(z8);
                    }
                } catch (NullPointerException e7) {
                    this.f29219z = 1;
                    m32315i(z8);
                    this.f29212s.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e7);
                }
            }
            this.f29218y.countDown();
            this.f29213t = null;
            this.f29215v = null;
        } catch (Throwable th) {
            this.f29218y.countDown();
            this.f29213t = null;
            this.f29215v = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzd(MotionEvent motionEvent) {
        zzaup zzaupVarM32316j = m32316j();
        if (zzaupVarM32316j == null) {
            this.f29205a.add(new Object[]{motionEvent});
        } else {
            m32314h();
            zzaupVarM32316j.zzd(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zze(int i7, int i8, int i9) {
        zzaup zzaupVarM32316j = m32316j();
        if (zzaupVarM32316j == null) {
            this.f29205a.add(new Object[]{Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)});
        } else {
            m32314h();
            zzaupVarM32316j.zze(i7, i8, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!m32319a()) {
            return "";
        }
        zzaup zzaupVarM32316j = m32316j();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlw)).booleanValue()) {
            C7351t.m32349g();
            C3431F0.m17423n(view, 4, null);
        }
        if (zzaupVarM32316j == null) {
            return "";
        }
        m32314h();
        return zzaupVarM32316j.zzf(m32317k(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzh(View view) {
        zzaup zzaupVarM32316j = m32316j();
        if (zzaupVarM32316j != null) {
            zzaupVarM32316j.zzh(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzaup zzaupVarM32316j;
        zzaup zzaupVarM32316j2;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdh)).booleanValue()) {
            if (this.f29218y.getCount() != 0 || (zzaupVarM32316j2 = m32316j()) == null) {
                return;
            }
            zzaupVarM32316j2.zzi(stackTraceElementArr);
            return;
        }
        if (!m32319a() || (zzaupVarM32316j = m32316j()) == null) {
            return;
        }
        zzaupVarM32316j.zzi(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzlv)).booleanValue()) {
            zzaup zzaupVarM32316j = m32316j();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlw)).booleanValue()) {
                C7351t.m32349g();
                C3431F0.m17423n(view, 2, null);
            }
            return zzaupVarM32316j != null ? zzaupVarM32316j.zzj(context, view, activity) : "";
        }
        if (!m32319a()) {
            return "";
        }
        zzaup zzaupVarM32316j2 = m32316j();
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlw)).booleanValue()) {
            C7351t.m32349g();
            C3431F0.m17423n(view, 2, null);
        }
        return zzaupVarM32316j2 != null ? zzaupVarM32316j2.zzj(context, view, activity) : "";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(final Context context) {
        try {
            return (String) zzgot.zzd(new Callable() { // from class: w2.j
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.f29202a.m32320b(context, null);
                }
            }, this.f29211r).get(((Integer) C3250D.m17200c().zzd(zzbci.zzda)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzaui.zza(context, this.f29216w.f30226a, f29204A, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        return m32320b(context, null);
    }
}
