package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzauq implements zzaup {
    protected static volatile zzavx zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    protected zzavp zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzauq(Context context) {
        try {
            zzatt.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue()) {
                this.zzr = new zzavp();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    private final String zzp(Context context, String str, int i7, View view, Activity activity, byte[] bArr) {
        zzauo zzauoVarZzh;
        String str2;
        int i8;
        Exception exc;
        int i9;
        int i10;
        String strZzb;
        int i11;
        int i12;
        zzarw zzarwVarZza;
        int i13;
        int i14;
        int i15 = i7;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcR)).booleanValue();
        zzarw zzarwVarZzb = null;
        if (zBooleanValue) {
            zzauoVarZzh = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzauoVarZzh = null;
            str2 = null;
        }
        try {
            if (i15 == 3) {
                zzarwVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i14 = 1002;
                } catch (Exception e7) {
                    exc = e7;
                    i8 = 3;
                    if (zBooleanValue) {
                        if (i15 == i8) {
                            i10 = 1003;
                        } else {
                            if (i15 == 2) {
                                i10 = 1009;
                            } else {
                                i9 = 1001;
                                i15 = 1;
                            }
                            zzauoVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i9 = i10;
                        zzauoVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            } else {
                if (i15 == 2) {
                    zzarwVarZza = zzc(context, view, activity);
                    i13 = 1008;
                } else {
                    zzarwVarZza = zza(context, null);
                    i13 = zzbbn.zzq.zzf;
                }
                zzarwVarZzb = zzarwVarZza;
                i14 = i13;
            }
            if (!zBooleanValue || zzauoVarZzh == null) {
                i8 = 3;
            } else {
                i8 = 3;
                try {
                    zzauoVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                } catch (Exception e8) {
                    e = e8;
                    exc = e;
                    if (zBooleanValue && zzauoVarZzh != null) {
                        if (i15 == i8) {
                            i10 = 1003;
                        } else {
                            if (i15 == 2) {
                                i10 = 1009;
                            } else {
                                i9 = 1001;
                                i15 = 1;
                            }
                            zzauoVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                        }
                        i9 = i10;
                        zzauoVarZzh.zza(i9, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, exc);
                    }
                }
            }
        } catch (Exception e9) {
            e = e9;
            i8 = 3;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (zzarwVarZzb != null) {
            try {
                if (((zzast) zzarwVarZzb.zzbu()).zzbr() == 0) {
                    strZzb = Integer.toString(5);
                } else {
                    zzast zzastVar = (zzast) zzarwVarZzb.zzbu();
                    int i16 = zzatt.zzc;
                    strZzb = zzatt.zzb(zzastVar.zzaN(), str);
                    if (zBooleanValue && zzauoVarZzh != null) {
                        if (i15 == i8) {
                            i11 = 1006;
                        } else {
                            i11 = i15 == 2 ? 1010 : 1004;
                        }
                        zzauoVarZzh.zza(i11, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                    }
                }
            } catch (Exception e10) {
                strZzb = Integer.toString(7);
                if (zBooleanValue && zzauoVarZzh != null) {
                    if (i15 == i8) {
                        i12 = 1007;
                    } else {
                        i12 = i15 == 2 ? 1011 : 1005;
                    }
                    zzauoVarZzh.zza(i12, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, e10);
                }
            }
        } else {
            strZzb = Integer.toString(5);
        }
        return strZzb;
    }

    protected abstract zzarw zza(Context context, zzari zzariVar);

    protected abstract zzarw zzb(Context context, View view, Activity activity);

    protected abstract zzarw zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzaup
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l7;
        try {
            if (this.zzu) {
                zzo();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d7 = rawX - this.zzs;
                double d8 = rawY - this.zzt;
                this.zzk += Math.sqrt((d7 * d7) + (d8 * d8));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        LinkedList linkedList = this.zzc;
                        linkedList.add(motionEventObtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zzn(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzavz zzavzVarZzm = zzm(motionEvent);
                        Long l8 = zzavzVarZzm.zzd;
                        if (l8 != null && zzavzVarZzm.zzg != null) {
                            this.zzi += l8.longValue() + zzavzVarZzm.zzg.longValue();
                        }
                        if (this.zzq != null && (l7 = zzavzVarZzm.zze) != null && zzavzVarZzm.zzh != null) {
                            this.zzj += l7.longValue() + zzavzVarZzm.zzh.longValue();
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzavn unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final synchronized void zze(int i7, int i8, int i9) {
        try {
            if (this.zzb != null) {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcP)).booleanValue()) {
                    zzo();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f7 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i9, 1, i7 * f7, i8 * f7, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzf(Context context, String str, View view, Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzg(Context context, String str, View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzavp zzavpVar;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzdg)).booleanValue() || (zzavpVar = this.zzr) == null) {
            return;
        }
        zzavpVar.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzj(Context context, View view, Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaup
    public final String zzl(Context context) {
        if (zzawa.zzd()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    protected abstract zzavz zzm(MotionEvent motionEvent);

    protected abstract long zzn(StackTraceElement[] stackTraceElementArr);
}
