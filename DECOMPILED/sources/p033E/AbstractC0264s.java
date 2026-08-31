package p033E;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C2399j;
import java.io.IOException;
import java.util.List;
import p025D.AbstractC0162e;
import p025D.AbstractC0165h;
import p066I0.AbstractC0578a;
import p089L.AbstractC0776l;
import p089L.C0769e;

/* JADX INFO: renamed from: E.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0264s {

    /* JADX INFO: renamed from: a */
    private static final AbstractC0270y f993a;

    /* JADX INFO: renamed from: b */
    private static final C2399j f994b;

    /* JADX INFO: renamed from: c */
    private static Paint f995c;

    /* JADX INFO: renamed from: E.s$a */
    public static class a extends AbstractC0776l.c {

        /* JADX INFO: renamed from: a */
        private AbstractC0165h.e f996a;

        public a(AbstractC0165h.e eVar) {
            this.f996a = eVar;
        }

        @Override // p089L.AbstractC0776l.c
        /* JADX INFO: renamed from: a */
        public void mo1234a(int i7) {
            AbstractC0165h.e eVar = this.f996a;
            if (eVar != null) {
                eVar.mo831f(i7);
            }
        }

        @Override // p089L.AbstractC0776l.c
        /* JADX INFO: renamed from: b */
        public void mo1235b(Typeface typeface) {
            AbstractC0165h.e eVar = this.f996a;
            if (eVar != null) {
                eVar.mo832g(typeface);
            }
        }
    }

    static {
        AbstractC0578a.m2543a("TypefaceCompat static init");
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            f993a = new C0269x();
        } else if (i7 >= 29) {
            f993a = new C0268w();
        } else if (i7 >= 28) {
            f993a = new C0267v();
        } else {
            f993a = new C0266u();
        }
        f994b = new C2399j(16);
        f995c = null;
        AbstractC0578a.m2544b();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m1224a(Context context, Typeface typeface, int i7) {
        if (context != null) {
            return Typeface.create(typeface, i7);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m1225b(Context context, CancellationSignal cancellationSignal, AbstractC0776l.b[] bVarArr, int i7) {
        AbstractC0578a.m2543a("TypefaceCompat.createFromFontInfo");
        try {
            return f993a.mo1247b(context, cancellationSignal, bVarArr, i7);
        } finally {
            AbstractC0578a.m2544b();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m1226c(Context context, CancellationSignal cancellationSignal, List list, int i7) {
        AbstractC0578a.m2543a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f993a.mo1248c(context, cancellationSignal, list, i7);
        } finally {
            AbstractC0578a.m2544b();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m1227d(Context context, AbstractC0162e.b bVar, Resources resources, int i7, String str, int i8, int i9, AbstractC0165h.e eVar, Handler handler, boolean z7) {
        Typeface typefaceMo1240a;
        if (bVar instanceof AbstractC0162e.e) {
            AbstractC0162e.e eVar2 = (AbstractC0162e.e) bVar;
            Typeface typefaceM1232i = m1232i(eVar2);
            if (typefaceM1232i != null) {
                if (eVar != null) {
                    eVar.m830d(typefaceM1232i, handler);
                }
                f994b.put(m1229f(resources, i7, str, i8, i9), typefaceM1232i);
                return typefaceM1232i;
            }
            typefaceMo1240a = AbstractC0776l.m3638c(context, eVar2.m799b(), i9, !z7 ? eVar != null : eVar2.m798a() != 0, z7 ? eVar2.m801d() : -1, AbstractC0165h.e.m828e(handler), new a(eVar));
        } else {
            typefaceMo1240a = f993a.mo1240a(context, (AbstractC0162e.c) bVar, resources, i9);
            if (eVar != null) {
                if (typefaceMo1240a != null) {
                    eVar.m830d(typefaceMo1240a, handler);
                } else {
                    eVar.m829c(-3, handler);
                }
            }
        }
        if (typefaceMo1240a != null) {
            f994b.put(m1229f(resources, i7, str, i8, i9), typefaceMo1240a);
        }
        return typefaceMo1240a;
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m1228e(Context context, Resources resources, int i7, String str, int i8, int i9) {
        Typeface typefaceMo1249d = f993a.mo1249d(context, resources, i7, str, i9);
        if (typefaceMo1249d != null) {
            f994b.put(m1229f(resources, i7, str, i8, i9), typefaceMo1249d);
        }
        return typefaceMo1249d;
    }

    /* JADX INFO: renamed from: f */
    private static String m1229f(Resources resources, int i7, String str, int i8, int i9) {
        return resources.getResourcePackageName(i7) + '-' + str + '-' + i8 + '-' + i7 + '-' + i9;
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m1230g(Resources resources, int i7, String str, int i8, int i9) {
        return (Typeface) f994b.get(m1229f(resources, i7, str, i8, i9));
    }

    /* JADX INFO: renamed from: h */
    public static Typeface m1231h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    private static Typeface m1232i(AbstractC0162e.e eVar) {
        FontFamily fontFamilyBuild;
        Typeface typefaceM1231h;
        String strM800c = eVar.m800c();
        if (!TextUtils.isEmpty(strM800c) && (typefaceM1231h = m1231h(strM800c)) != null) {
            return typefaceM1231h;
        }
        List listM799b = eVar.m799b();
        if (listM799b.size() == 1) {
            return m1231h(((C0769e) listM799b.get(0)).m3619h());
        }
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (int i7 = 0; i7 < listM799b.size(); i7++) {
            if (m1231h(((C0769e) listM799b.get(i7)).m3619h()) == null) {
                return null;
            }
        }
        Typeface.CustomFallbackBuilder customFallbackBuilderM1212a = null;
        for (int i8 = 0; i8 < listM799b.size(); i8++) {
            C0769e c0769e = (C0769e) listM799b.get(i8);
            if (i8 == listM799b.size() - 1 && TextUtils.isEmpty(c0769e.m3620i())) {
                customFallbackBuilderM1212a.setSystemFallback(c0769e.m3619h());
                break;
            }
            Font fontM1233j = m1233j(m1231h(c0769e.m3619h()));
            if (fontM1233j == null) {
                Log.w("TypefaceCompat", "Unable identify the primary font for " + c0769e.m3619h() + ". Falling back to provider font.");
                return null;
            }
            if (TextUtils.isEmpty(c0769e.m3620i())) {
                try {
                    AbstractC0253h.m1213a();
                    AbstractC0254i.m1214a();
                    fontFamilyBuild = AbstractC0251f.m1211a(AbstractC0263r.m1223a(fontM1233j).setFontVariationSettings(c0769e.m3620i()).build()).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            } else {
                fontFamilyBuild = AbstractC0251f.m1211a(fontM1233j).build();
            }
            if (customFallbackBuilderM1212a == null) {
                customFallbackBuilderM1212a = AbstractC0252g.m1212a(fontFamilyBuild);
            } else {
                customFallbackBuilderM1212a.addCustomFallback(fontFamilyBuild);
            }
        }
        return customFallbackBuilderM1212a.build();
    }

    /* JADX INFO: renamed from: j */
    public static Font m1233j(Typeface typeface) {
        if (f995c == null) {
            f995c = new Paint();
        }
        f995c.setTextSize(10.0f);
        f995c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f995c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
