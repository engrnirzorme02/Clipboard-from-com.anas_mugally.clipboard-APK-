package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacq implements zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacp zzc = new zzacp(zzacn.zza);
    private static final zzacp zzd = new zzacp(zzacm.zza);
    private zzgjz zze;
    private final zzajt zzf = new zzajo();

    private final void zzc(int i7, List list) {
        switch (i7) {
            case 0:
                list.add(new zzals());
                break;
            case 1:
                list.add(new zzalv());
                break;
            case 2:
                list.add(new zzaly(0));
                break;
            case 3:
                list.add(new zzaej(0));
                break;
            case 4:
                zzacu zzacuVarZza = zzc.zza(0);
                if (zzacuVarZza == null) {
                    list.add(new zzafa(0));
                } else {
                    list.add(zzacuVarZza);
                }
                break;
            case 5:
                list.add(new zzafd());
                break;
            case 6:
                list.add(new zzagz(this.zzf, 0));
                break;
            case 7:
                list.add(new zzahg(0));
                break;
            case 8:
                zzajt zzajtVar = this.zzf;
                list.add(new zzaif(zzajtVar, 0, null, null, zzgjz.zzi(), null));
                list.add(new zzaim(zzajtVar, 0));
                break;
            case 9:
                list.add(new zzajc());
                break;
            case 10:
                list.add(new zzanc());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzgjz.zzi();
                }
                list.add(new zzann(1, 0, this.zzf, new zzel(0L), new zzama(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaoa());
                break;
            case 14:
                list.add(new zzafj(0));
                break;
            case 15:
                zzacu zzacuVarZza2 = zzd.zza(new Object[0]);
                if (zzacuVarZza2 != null) {
                    list.add(zzacuVarZza2);
                }
                break;
            case 16:
                list.add(new zzaen(0, this.zzf));
                break;
            case 17:
                list.add(new zzajm());
                break;
            case 18:
                list.add(new zzaof());
                break;
            case 19:
                list.add(new zzaev());
                break;
            case 20:
                list.add(new zzafi());
                break;
            case zzbbn.zzt.zzm /* 21 */:
                list.add(new zzaeu());
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final synchronized zzacu[] zza() {
        return zzb(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzada
    public final synchronized zzacu[] zzb(Uri uri, Map map) {
        ArrayList arrayList;
        int i7;
        int i8;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                switch (zzar.zzi(str)) {
                    case "audio/ac3":
                    case "audio/eac3":
                    case "audio/eac3-joc":
                        i7 = 0;
                        break;
                    case "audio/ac4":
                        i7 = 1;
                        break;
                    case "audio/amr":
                    case "audio/3gpp":
                    case "audio/amr-wb":
                        i7 = 3;
                        break;
                    case "audio/flac":
                        i7 = 4;
                        break;
                    case "video/x-flv":
                        i7 = 5;
                        break;
                    case "audio/midi":
                        i7 = 15;
                        break;
                    case "video/x-matroska":
                    case "audio/x-matroska":
                    case "video/webm":
                    case "audio/webm":
                    case "application/webm":
                        i7 = 6;
                        break;
                    case "audio/mpeg":
                        i7 = 7;
                        break;
                    case "video/mp4":
                    case "audio/mp4":
                    case "application/mp4":
                        i7 = 8;
                        break;
                    case "audio/ogg":
                        i7 = 9;
                        break;
                    case "video/mp2p":
                        i7 = 10;
                        break;
                    case "video/mp2t":
                        i7 = 11;
                        break;
                    case "audio/wav":
                        i7 = 12;
                        break;
                    case "text/vtt":
                        i7 = 13;
                        break;
                    case "image/jpeg":
                        i7 = 14;
                        break;
                    case "video/x-msvideo":
                        i7 = 16;
                        break;
                    case "image/png":
                        i7 = 17;
                        break;
                    case "image/webp":
                        i7 = 18;
                        break;
                    case "image/bmp":
                        i7 = 19;
                        break;
                    case "image/heif":
                    case "image/heic":
                        i7 = 20;
                        break;
                    case "image/avif":
                        i7 = 21;
                        break;
                    default:
                        i7 = -1;
                        break;
                }
            } else {
                i7 = -1;
            }
            if (i7 != -1) {
                zzc(i7, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i8 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i8 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i8 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i8 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i8 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i8 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i8 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i8 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i8 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i8 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i8 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i8 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i8 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i8 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i8 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i8 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i8 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i8 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i8 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i8 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i8 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i8 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i8 = 21;
            } else {
                i8 = -1;
            }
            if (i8 != -1 && i8 != i7) {
                zzc(i8, arrayList);
            }
            int[] iArr = zzb;
            for (int i9 = 0; i9 < 21; i9++) {
                int i10 = iArr[i9];
                if (i10 != i7 && i10 != i8) {
                    zzc(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzacu[]) arrayList.toArray(new zzacu[0]);
    }
}
