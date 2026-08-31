package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajo implements zzajt {
    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zza(zzu zzuVar) {
        String str = zzuVar.zzo;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    @Override // com.google.android.gms.internal.ads.zzajt
    public final int zzb(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/vobsub":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    @Override // com.google.android.gms.internal.ads.zzajt
    public final zzajv zzc(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzakl(zzuVar.zzr);
                case "text/vtt":
                    return new zzaln();
                case "application/x-mp4-vtt":
                    return new zzald();
                case "application/x-subrip":
                    return new zzakp();
                case "application/x-quicktime-tx3g":
                    return new zzala(zzuVar.zzr);
                case "application/pgs":
                    return new zzakj();
                case "application/vobsub":
                    return new zzalc(zzuVar.zzr);
                case "application/dvbsubs":
                    return new zzakh(zzuVar.zzr);
                case "application/ttml+xml":
                    return new zzakv();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }
}
