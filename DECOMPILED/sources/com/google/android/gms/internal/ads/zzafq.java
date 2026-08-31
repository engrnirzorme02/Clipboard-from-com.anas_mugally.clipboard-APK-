package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzafq {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzafm zza(String str) {
        long j7;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzep.zzb(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzas.zzb("Couldn't find xmp metadata", null);
            }
            zzgjz zzgjzVarZzi = zzgjz.zzi();
            long j8 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzep.zzb(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        String strZzc = zzep.zzc(xmlPullParserNewPullParser, strArr[i8]);
                        if (strZzc != null) {
                            if (Integer.parseInt(strZzc) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i9 = 0;
                            while (true) {
                                if (i9 < 4) {
                                    String strZzc2 = zzep.zzc(xmlPullParserNewPullParser, strArr2[i9]);
                                    if (strZzc2 != null) {
                                        j7 = Long.parseLong(strZzc2);
                                        if (j7 != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i9++;
                                }
                                j7 = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i7 >= 2) {
                                    zzgjzVarZzi = zzgjz.zzi();
                                    break;
                                }
                                String strZzc3 = zzep.zzc(xmlPullParserNewPullParser, strArr3[i7]);
                                if (strZzc3 != null) {
                                    zzgjzVarZzi = zzgjz.zzk(new zzafl("image/jpeg", "Primary", 0L, 0L), new zzafl("video/mp4", "MotionPhoto", Long.parseLong(strZzc3), 0L));
                                    break;
                                }
                                i7++;
                            }
                            j8 = j7;
                        }
                    }
                    return null;
                }
                if (zzep.zzb(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgjzVarZzi = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzep.zzb(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgjzVarZzi = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzep.zza(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgjzVarZzi.isEmpty()) {
                return null;
            }
            return new zzafm(j8, zzgjzVarZzi);
        } catch (zzas | NumberFormatException | XmlPullParserException unused) {
            zzds.zzc("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzgjz zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i7 = zzgjz.zzd;
        zzgjw zzgjwVar = new zzgjw();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzep.zzb(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZzc = zzep.zzc(xmlPullParser, strConcat2);
                String strZzc2 = zzep.zzc(xmlPullParser, strConcat3);
                String strZzc3 = zzep.zzc(xmlPullParser, strConcat4);
                String strZzc4 = zzep.zzc(xmlPullParser, strConcat5);
                if (strZzc == null || strZzc2 == null) {
                    return zzgjz.zzi();
                }
                zzgjwVar.zzf(new zzafl(strZzc, strZzc2, strZzc3 != null ? Long.parseLong(strZzc3) : 0L, strZzc4 != null ? Long.parseLong(strZzc4) : 0L));
            }
        } while (!zzep.zza(xmlPullParser, str.concat(":Directory")));
        return zzgjwVar.zzi();
    }
}
