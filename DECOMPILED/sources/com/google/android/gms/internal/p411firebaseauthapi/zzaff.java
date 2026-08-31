package com.google.android.gms.internal.p411firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3606j;
import com.google.android.gms.common.api.internal.InterfaceC3608k;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.AbstractC4880u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p164V3.C1762g;
import p192Z3.InterfaceC2143u;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected C1762g zzc;
    protected AbstractC4880u zzd;
    protected CallbackT zze;
    protected InterfaceC2143u zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AbstractC4854g zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<AbstractC4825I> zzh = new ArrayList();

    private static class zza extends AbstractC3606j {
        private final List<AbstractC4825I> zza;

        private zza(InterfaceC3608k interfaceC3608k, List<AbstractC4825I> list) {
            super(interfaceC3608k);
            this.mLifecycleFragment.mo17923a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<AbstractC4825I> list) {
            InterfaceC3608k fragment = AbstractC3606j.getFragment(activity);
            if (((zza) fragment.mo17924c("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC3606j
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i7) {
        this.zza = i7;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = (CallbackT) AbstractC3718s.m18084m(callbackt, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(InterfaceC2143u interfaceC2143u) {
        this.zzf = (InterfaceC2143u) AbstractC3718s.m18084m(interfaceC2143u, "external failure callback cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(C1762g c1762g) {
        this.zzc = (C1762g) AbstractC3718s.m18084m(c1762g, "firebaseApp cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(AbstractC4880u abstractC4880u) {
        this.zzd = (AbstractC4880u) AbstractC3718s.m18084m(abstractC4880u, "firebaseUser cannot be null");
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(AbstractC4825I abstractC4825I, Activity activity, Executor executor, String str) {
        AbstractC4825I abstractC4825IZza = zzagb.zza(str, abstractC4825I, this);
        synchronized (this.zzh) {
            this.zzh.add((AbstractC4825I) AbstractC3718s.m18083l(abstractC4825IZza));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) AbstractC3718s.m18083l(executor);
        return this;
    }

    static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        AbstractC3718s.m18087p(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        InterfaceC2143u interfaceC2143u = zzaffVar.zzf;
        if (interfaceC2143u != null) {
            interfaceC2143u.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
