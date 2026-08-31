package p033E;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import p089L.AbstractC0776l;

/* JADX INFO: renamed from: E.x */
/* JADX INFO: loaded from: classes.dex */
public class C0269x extends C0268w {
    /* JADX INFO: renamed from: n */
    private static Typeface m1265n(String str) {
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }

    @Override // p033E.C0268w
    /* JADX INFO: renamed from: l */
    protected Font mo1264l(AbstractC0776l.b bVar) {
        Typeface typefaceM1265n;
        Font fontM1233j;
        String strM3647c = bVar.m3647c();
        if (strM3647c == null || (typefaceM1265n = m1265n(strM3647c)) == null || (fontM1233j = AbstractC0264s.m1233j(typefaceM1265n)) == null) {
            return null;
        }
        if (TextUtils.isEmpty(bVar.m3650f())) {
            return fontM1233j;
        }
        try {
            return new Font.Builder(fontM1233j).setFontVariationSettings(bVar.m3650f()).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
