package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhki implements Iterator {
    private final ArrayDeque zza;
    private zzhgy zzb;

    /* synthetic */ zzhki(zzhhb zzhhbVar, byte[] bArr) {
        if (!(zzhhbVar instanceof zzhkj)) {
            this.zza = null;
            this.zzb = (zzhgy) zzhhbVar;
            return;
        }
        zzhkj zzhkjVar = (zzhkj) zzhhbVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzhkjVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzhkjVar);
        this.zzb = zzb(zzhkjVar.zzB());
    }

    private final zzhgy zzb(zzhhb zzhhbVar) {
        while (zzhhbVar instanceof zzhkj) {
            zzhkj zzhkjVar = (zzhkj) zzhhbVar;
            this.zza.push(zzhkjVar);
            zzhhbVar = zzhkjVar.zzB();
        }
        return (zzhgy) zzhhbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzhgy next() {
        zzhgy zzhgyVarZzb;
        zzhgy zzhgyVar = this.zzb;
        if (zzhgyVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzhgyVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzhgyVarZzb = zzb(((zzhkj) arrayDeque.pop()).zzC());
        } while (zzhgyVarZzb.zzc() == 0);
        this.zzb = zzhgyVarZzb;
        return zzhgyVar;
    }
}
