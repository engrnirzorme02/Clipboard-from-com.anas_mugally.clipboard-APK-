package p033E;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p025D.AbstractC0162e;
import p089L.AbstractC0776l;

/* JADX INFO: renamed from: E.w */
/* JADX INFO: loaded from: classes.dex */
public class C0268w extends AbstractC0270y {
    /* JADX INFO: renamed from: h */
    private Font m1258h(FontFamily fontFamily, int i7) {
        FontStyle fontStyle = new FontStyle((i7 & 1) != 0 ? 700 : 400, (i7 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM1261m = m1261m(fontStyle, font.getStyle());
        for (int i8 = 1; i8 < fontFamily.getSize(); i8++) {
            Font font2 = fontFamily.getFont(i8);
            int iM1261m2 = m1261m(fontStyle, font2.getStyle());
            if (iM1261m2 < iM1261m) {
                font = font2;
                iM1261m = iM1261m2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: i */
    private Font m1259i(CancellationSignal cancellationSignal, AbstractC0776l.b bVar, ContentResolver contentResolver) {
        return bVar.m3653i() ? mo1264l(bVar) : m1260k(cancellationSignal, bVar, contentResolver);
    }

    /* JADX INFO: renamed from: k */
    private Font m1260k(CancellationSignal cancellationSignal, AbstractC0776l.b bVar, ContentResolver contentResolver) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(bVar.m3649e(), "r", cancellationSignal);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return null;
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            try {
                Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(bVar.m3651g()).setSlant(bVar.m3652h() ? 1 : 0).setTtcIndex(bVar.m3648d());
                if (!TextUtils.isEmpty(bVar.m3650f())) {
                    ttcIndex.setFontVariationSettings(bVar.m3650f());
                }
                Font fontBuild = ttcIndex.build();
                parcelFileDescriptorOpenFileDescriptor.close();
                return fontBuild;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private static int m1261m(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: a */
    public Typeface mo1240a(Context context, AbstractC0162e.c cVar, Resources resources, int i7) {
        try {
            FontFamily.Builder builder = null;
            for (AbstractC0162e.d dVar : cVar.m791a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, dVar.m793b()).setWeight(dVar.m796e()).setSlant(dVar.m797f() ? 1 : 0).setTtcIndex(dVar.m794c()).setFontVariationSettings(dVar.m795d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m1258h(fontFamilyBuild, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: b */
    public Typeface mo1247b(Context context, CancellationSignal cancellationSignal, AbstractC0776l.b[] bVarArr, int i7) {
        try {
            FontFamily fontFamilyM1263j = m1263j(cancellationSignal, bVarArr, context.getContentResolver());
            if (fontFamilyM1263j == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM1263j).setStyle(m1258h(fontFamilyM1263j, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: c */
    public Typeface mo1248c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM1263j = m1263j(cancellationSignal, (AbstractC0776l.b[]) list.get(0), contentResolver);
            if (fontFamilyM1263j == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM1263j);
            for (int i8 = 1; i8 < list.size(); i8++) {
                FontFamily fontFamilyM1263j2 = m1263j(cancellationSignal, (AbstractC0776l.b[]) list.get(i8), contentResolver);
                if (fontFamilyM1263j2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM1263j2);
                }
            }
            return customFallbackBuilder.setStyle(m1258h(fontFamilyM1263j, i7).getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: d */
    public Typeface mo1249d(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font fontBuild = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e7) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e7);
            return null;
        }
    }

    @Override // p033E.AbstractC0270y
    /* JADX INFO: renamed from: g */
    protected AbstractC0776l.b mo1262g(AbstractC0776l.b[] bVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* JADX INFO: renamed from: j */
    protected FontFamily m1263j(CancellationSignal cancellationSignal, AbstractC0776l.b[] bVarArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (AbstractC0776l.b bVar : bVarArr) {
            Font fontM1259i = m1259i(cancellationSignal, bVar, contentResolver);
            if (fontM1259i != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontM1259i);
                } else {
                    builder.addFont(fontM1259i);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: l */
    protected Font mo1264l(AbstractC0776l.b bVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
