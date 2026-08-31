package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.client.C3296S1;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3339f0;
import com.google.android.gms.ads.internal.client.InterfaceC3347h0;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p157U3.InterfaceFutureC1673e;
import p314o2.EnumC6551c;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzflb {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfdy zzd;
    protected C3296S1 zze;
    protected AtomicBoolean zzf;
    protected InterfaceC3347h0 zzg;
    private InterfaceC3339f0 zzh;
    private final Queue zzi;
    private final zzfkf zzj;
    private final String zzk;
    private AtomicBoolean zzl;
    private final ScheduledExecutorService zzm;
    private AtomicBoolean zzn;
    private AtomicBoolean zzo;
    private zzfkk zzp;
    private final InterfaceC3750e zzq;
    private final zzfkr zzr;

    public zzflb(ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3339f0 interfaceC3339f0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        this("none", clientApi, context, i7, zzfdyVar, c3296s1, scheduledExecutorService, zzfkfVar, interfaceC3750e);
        this.zzh = interfaceC3339f0;
    }

    static final /* synthetic */ double zzD(InterfaceC3328c1 interfaceC3328c1) {
        if (interfaceC3328c1 instanceof zzcvl) {
            return ((zzcvl) interfaceC3328c1).zzl();
        }
        return 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzF, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzt(Object obj) {
        try {
            this.zzl.set(false);
            if (obj != null) {
                this.zzj.zza();
                this.zzo.set(true);
                zzI(obj);
            }
            zzJ(obj == null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzG, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzu(Throwable th) {
        try {
            this.zzl.set(false);
            if ((th instanceof zzfjx) && ((zzfjx) th).zza() == 0) {
                throw null;
            }
            zzJ(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzv(C3324b1 c3324b1) {
        try {
            if (this.zzn.get()) {
                C3431F0.f14180l.post(new zzfky(this, c3324b1));
            }
            this.zzl.set(false);
            int i7 = c3324b1.f13918a;
            if (i7 != 1 && i7 != 8 && i7 != 10 && i7 != 11) {
                zzJ(true);
                return;
            }
            C3296S1 c3296s1 = this.zze;
            int i8 = c3296s1.f13902b;
            String str = c3296s1.f13901a;
            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i8);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String string = sb.toString();
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33330e(string);
            this.zzf.set(false);
            zzfkq zzfkqVar = new zzfkq(this.zze.f13901a, zzm());
            zzfkqVar.zza(this.zzk);
            this.zzp.zzk(this.zzq.mo18159a(), new zzfkr(zzfkqVar, null), c3324b1, this.zze.f13904d, zzn(), zzz());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzI(Object obj) {
        try {
            InterfaceC3750e interfaceC3750e = this.zzq;
            zzfks zzfksVar = new zzfks(obj, interfaceC3750e);
            this.zzi.add(zzfksVar);
            InterfaceC3328c1 interfaceC3328c1Zzb = zzb(obj);
            long jMo18159a = interfaceC3750e.mo18159a();
            if (this.zzn.get()) {
                C3431F0.f14180l.post(new zzfkw(this, interfaceC3328c1Zzb));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzm;
            scheduledExecutorService.execute(new zzfkx(this, jMo18159a, interfaceC3328c1Zzb));
            scheduledExecutorService.schedule(new zzfkv(this), zzfksVar.zzc(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzJ(boolean z7) {
        try {
            zzfkf zzfkfVar = this.zzj;
            if (zzfkfVar.zzd()) {
                return;
            }
            if (z7) {
                zzfkfVar.zzc();
            }
            this.zzm.schedule(new zzfkv(this), zzfkfVar.zzb(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzK() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            if (((zzfks) it.next()).zzb()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzw(C3324b1 c3324b1) {
        InterfaceC3347h0 interfaceC3347h0 = this.zzg;
        if (interfaceC3347h0 != null) {
            try {
                interfaceC3347h0.mo17227G(this.zzk, c3324b1);
            } catch (RemoteException unused) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzx(InterfaceC3328c1 interfaceC3328c1) {
        InterfaceC3347h0 interfaceC3347h0;
        InterfaceC3339f0 interfaceC3339f0 = this.zzh;
        if (interfaceC3339f0 == null) {
            interfaceC3347h0 = this.zzg;
            if (interfaceC3347h0 != null) {
                interfaceC3347h0.mo17228o0(this.zzk, interfaceC3328c1);
                return;
            }
            return;
        }
        try {
            interfaceC3339f0.mo17224F0(this.zze);
        } catch (RemoteException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Failed to call onAdsAvailable");
        }
        interfaceC3347h0 = this.zzg;
        if (interfaceC3347h0 != null) {
            try {
                interfaceC3347h0.mo17228o0(this.zzk, interfaceC3328c1);
                return;
            } catch (RemoteException unused2) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to call onAdPreloaded");
                return;
            }
        }
        return;
        throw th;
    }

    private final synchronized void zzN() {
        try {
            if (this.zzo.get() && this.zzi.isEmpty()) {
                this.zzo.set(false);
                if (this.zzn.get()) {
                    C3431F0.f14180l.post(new zzfkz(this));
                }
                this.zzm.execute(new zzfla(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:24:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x0028, please report this as an issue */
    /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzy() {
        InterfaceC3347h0 interfaceC3347h0;
        InterfaceC3339f0 interfaceC3339f0 = this.zzh;
        if (interfaceC3339f0 == null) {
            interfaceC3347h0 = this.zzg;
            if (interfaceC3347h0 != null) {
                interfaceC3347h0.zzf(this.zzk);
                return;
            }
            return;
        }
        try {
            interfaceC3339f0.mo17225X(this.zze);
        } catch (RemoteException unused) {
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33331f("Failed to call onAdsExhausted");
        }
        interfaceC3347h0 = this.zzg;
        if (interfaceC3347h0 != null) {
            try {
                interfaceC3347h0.zzf(this.zzk);
                return;
            } catch (RemoteException unused2) {
                int i8 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33331f("Failed to call onAdsExhausted");
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzP, reason: merged with bridge method [inline-methods] */
    public final String zzz() {
        return true != "none".equals(this.zzk) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzQ(InterfaceC3328c1 interfaceC3328c1) {
        if (interfaceC3328c1 instanceof zzcvl) {
            return ((zzcvl) interfaceC3328c1).zzk();
        }
        return null;
    }

    final /* synthetic */ zzfkk zzA() {
        return this.zzp;
    }

    final /* synthetic */ InterfaceC3750e zzB() {
        return this.zzq;
    }

    final /* synthetic */ zzfkr zzC() {
        return this.zzr;
    }

    protected abstract InterfaceFutureC1673e zza(Context context);

    protected abstract InterfaceC3328c1 zzb(Object obj);

    public final synchronized zzflb zzc() {
        this.zzm.submit(new zzfkv(this));
        return this;
    }

    public final synchronized boolean zzd() {
        zzK();
        return !this.zzi.isEmpty();
    }

    public final synchronized Object zze() {
        try {
            this.zzj.zza();
            Queue queue = this.zzi;
            zzfks zzfksVar = (zzfks) queue.poll();
            this.zzo.set(zzfksVar != null);
            if (zzfksVar == null) {
                zzfksVar = null;
            } else if (!queue.isEmpty()) {
                zzfks zzfksVar2 = (zzfks) queue.peek();
                EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(this.zze.f13902b);
                String strZzQ = zzQ(zzb(zzfksVar.zza()));
                if (zzfksVar2 != null && enumC6551cM27812c != null && strZzQ != null && zzfksVar2.zzd() < zzfksVar.zzd()) {
                    this.zzp.zzg(this.zzq.mo18159a(), this.zze.f13904d, zzn(), strZzQ, this.zzr, zzz());
                }
            }
            zzq();
            if (zzfksVar == null) {
                return null;
            }
            return zzfksVar.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzf() {
        this.zzf.set(false);
        this.zzn.set(false);
    }

    public final void zzg() {
        this.zzf.set(false);
    }

    public final synchronized void zzh() {
        this.zzf.set(true);
        this.zzn.set(true);
        this.zzm.submit(new zzfkv(this));
    }

    public final synchronized String zzi() {
        Object objZzp;
        objZzp = zzp();
        return zzQ(objZzp == null ? null : zzb(objZzp));
    }

    public final void zzj(zzfkk zzfkkVar) {
        this.zzp = zzfkkVar;
    }

    public final synchronized void zzk(int i7) {
        AbstractC3718s.m18072a(i7 >= 5);
        this.zzj.zze(i7);
    }

    protected final String zzl() {
        return this.zzk;
    }

    protected final EnumC6551c zzm() {
        return EnumC6551c.m27812c(this.zze.f13902b);
    }

    protected final synchronized int zzn() {
        return this.zzi.size();
    }

    protected final void zzo() {
        this.zzi.clear();
    }

    protected final synchronized Object zzp() {
        zzfks zzfksVar = (zzfks) this.zzi.peek();
        if (zzfksVar == null) {
            return null;
        }
        return zzfksVar.zza();
    }

    protected final synchronized void zzq() {
        InterfaceFutureC1673e interfaceFutureC1673eZza;
        try {
            zzK();
            zzN();
            if (!this.zzl.get() && this.zzf.get() && this.zzi.size() < this.zze.f13904d) {
                this.zzl.set(true);
                Activity activityZzd = C7351t.m32353k().zzd();
                if (activityZzd == null) {
                    String strValueOf = String.valueOf(this.zze.f13901a);
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33331f("Empty activity context at preloading: ".concat(strValueOf));
                    interfaceFutureC1673eZza = zza(this.zzb);
                } else {
                    interfaceFutureC1673eZza = zza(activityZzd);
                }
                zzgot.zzq(interfaceFutureC1673eZza, new zzfkt(this), this.zzm);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    protected final void zzr(int i7) {
        AbstractC3718s.m18072a(i7 > 0);
        EnumC6551c enumC6551cM27812c = EnumC6551c.m27812c(this.zze.f13902b);
        int i8 = this.zze.f13904d;
        synchronized (this) {
            try {
                C3296S1 c3296s1 = this.zze;
                this.zze = new C3296S1(c3296s1.f13901a, c3296s1.f13902b, c3296s1.f13903c, i7 > 0 ? i7 : c3296s1.f13904d);
                Queue queue = this.zzi;
                if (queue.size() > i7) {
                    if (((Boolean) C3250D.m17200c().zzd(zzbci.zzv)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i9 = 0; i9 < i7; i9++) {
                            zzfks zzfksVar = (zzfks) queue.poll();
                            if (zzfksVar != null) {
                                arrayList.add(zzfksVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfkk zzfkkVar = this.zzp;
        if (zzfkkVar == null || enumC6551cM27812c == null) {
            return;
        }
        zzfkkVar.zzc(i8, i7, this.zzq.mo18159a(), new zzfkr(new zzfkq(this.zze.f13901a, enumC6551cM27812c), null));
    }

    protected final void zzs(C3349h2 c3349h2) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzA)).booleanValue()) {
            Bundle bundle = c3349h2.f13948M;
            bundle.putInt("plcs", zzn());
            bundle.putInt("plbs", this.zze.f13904d);
            bundle.putString("plid", this.zzk);
        }
    }

    public zzflb(String str, ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, InterfaceC3347h0 interfaceC3347h0, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        this(str, clientApi, context, i7, zzfdyVar, c3296s1, scheduledExecutorService, zzfkfVar, interfaceC3750e);
        this.zzg = interfaceC3347h0;
    }

    private zzflb(String str, ClientApi clientApi, Context context, int i7, zzfdy zzfdyVar, C3296S1 c3296s1, ScheduledExecutorService scheduledExecutorService, zzfkf zzfkfVar, InterfaceC3750e interfaceC3750e) {
        this.zzk = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i7;
        this.zzd = zzfdyVar;
        this.zze = c3296s1;
        this.zzi = new PriorityQueue(Math.max(1, c3296s1.f13904d), new zzfku(this));
        this.zzf = new AtomicBoolean(true);
        this.zzl = new AtomicBoolean(false);
        this.zzm = scheduledExecutorService;
        this.zzj = zzfkfVar;
        this.zzn = new AtomicBoolean(true);
        this.zzo = new AtomicBoolean(false);
        this.zzq = interfaceC3750e;
        zzfkq zzfkqVar = new zzfkq(c3296s1.f13901a, EnumC6551c.m27812c(this.zze.f13902b));
        zzfkqVar.zza(str);
        this.zzr = new zzfkr(zzfkqVar, null);
    }
}
