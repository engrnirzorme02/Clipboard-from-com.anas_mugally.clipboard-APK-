package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayz {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzayyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzayy zzayyVar2 = (zzayy) it.next();
                    if (C7351t.m32354l().zzo().zzc()) {
                        if (!C7351t.m32354l().zzo().zze() && !zzayyVar.equals(zzayyVar2) && zzayyVar2.zzc().equals(zzayyVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzayyVar.equals(zzayyVar2) && zzayyVar2.zzb().equals(zzayyVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzayy zzayyVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String string = sb.toString();
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a(string);
                    list.remove(0);
                }
                int i8 = this.zza;
                this.zza = i8 + 1;
                zzayyVar.zzk(i8);
                zzayyVar.zzh();
                list.add(zzayyVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
