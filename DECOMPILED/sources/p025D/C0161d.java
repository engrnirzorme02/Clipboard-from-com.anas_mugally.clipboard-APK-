package p025D;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0161d {

    /* JADX INFO: renamed from: a */
    private final Shader f770a;

    /* JADX INFO: renamed from: b */
    private final ColorStateList f771b;

    /* JADX INFO: renamed from: c */
    private int f772c;

    private C0161d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f770a = shader;
        this.f771b = colorStateList;
        this.f772c = i7;
    }

    /* JADX INFO: renamed from: a */
    private static C0161d m769a(Resources resources, int i7, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return m772d(AbstractC0163f.m803b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return m771c(AbstractC0160c.m762b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: b */
    static C0161d m770b(int i7) {
        return new C0161d(null, null, i7);
    }

    /* JADX INFO: renamed from: c */
    static C0161d m771c(ColorStateList colorStateList) {
        return new C0161d(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* JADX INFO: renamed from: d */
    static C0161d m772d(Shader shader) {
        return new C0161d(shader, null, 0);
    }

    /* JADX INFO: renamed from: g */
    public static C0161d m773g(Resources resources, int i7, Resources.Theme theme) {
        try {
            return m769a(resources, i7, theme);
        } catch (Exception e7) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public int m774e() {
        return this.f772c;
    }

    /* JADX INFO: renamed from: f */
    public Shader m775f() {
        return this.f770a;
    }

    /* JADX INFO: renamed from: h */
    public boolean m776h() {
        return this.f770a != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m777i() {
        ColorStateList colorStateList;
        return this.f770a == null && (colorStateList = this.f771b) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public boolean m778j(int[] iArr) {
        if (!m777i()) {
            return false;
        }
        ColorStateList colorStateList = this.f771b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f772c) {
            return false;
        }
        this.f772c = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void m779k(int i7) {
        this.f772c = i7;
    }

    /* JADX INFO: renamed from: l */
    public boolean m780l() {
        return m776h() || this.f772c != 0;
    }
}
