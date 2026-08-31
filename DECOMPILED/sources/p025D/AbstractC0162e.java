package p025D;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p009B.AbstractC0041d;
import p089L.C0769e;

/* JADX INFO: renamed from: D.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0162e {

    /* JADX INFO: renamed from: D.e$a */
    static class a {
        /* JADX INFO: renamed from: a */
        static int m790a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    /* JADX INFO: renamed from: D.e$b */
    public interface b {
    }

    /* JADX INFO: renamed from: D.e$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        private final d[] f773a;

        public c(d[] dVarArr) {
            this.f773a = dVarArr;
        }

        /* JADX INFO: renamed from: a */
        public d[] m791a() {
            return this.f773a;
        }
    }

    /* JADX INFO: renamed from: D.e$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        private final String f774a;

        /* JADX INFO: renamed from: b */
        private final int f775b;

        /* JADX INFO: renamed from: c */
        private final boolean f776c;

        /* JADX INFO: renamed from: d */
        private final String f777d;

        /* JADX INFO: renamed from: e */
        private final int f778e;

        /* JADX INFO: renamed from: f */
        private final int f779f;

        public d(String str, int i7, boolean z7, String str2, int i8, int i9) {
            this.f774a = str;
            this.f775b = i7;
            this.f776c = z7;
            this.f777d = str2;
            this.f778e = i8;
            this.f779f = i9;
        }

        /* JADX INFO: renamed from: a */
        public String m792a() {
            return this.f774a;
        }

        /* JADX INFO: renamed from: b */
        public int m793b() {
            return this.f779f;
        }

        /* JADX INFO: renamed from: c */
        public int m794c() {
            return this.f778e;
        }

        /* JADX INFO: renamed from: d */
        public String m795d() {
            return this.f777d;
        }

        /* JADX INFO: renamed from: e */
        public int m796e() {
            return this.f775b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m797f() {
            return this.f776c;
        }
    }

    /* JADX INFO: renamed from: D.e$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        private final List f780a;

        /* JADX INFO: renamed from: b */
        private final int f781b;

        /* JADX INFO: renamed from: c */
        private final int f782c;

        /* JADX INFO: renamed from: d */
        private final String f783d;

        public e(List list, int i7, int i8, String str) {
            this.f780a = list;
            this.f782c = i7;
            this.f781b = i8;
            this.f783d = str;
        }

        /* JADX INFO: renamed from: a */
        public int m798a() {
            return this.f782c;
        }

        /* JADX INFO: renamed from: b */
        public List m799b() {
            return this.f780a;
        }

        /* JADX INFO: renamed from: c */
        public String m800c() {
            return this.f783d;
        }

        /* JADX INFO: renamed from: d */
        public int m801d() {
            return this.f781b;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m781a(TypedArray typedArray, int i7) {
        return a.m790a(typedArray, i7);
    }

    /* JADX INFO: renamed from: b */
    public static b m782b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m785e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: c */
    public static List m783c(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (m781a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < typedArrayObtainTypedArray.length(); i8++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(m789i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m789i(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    private static C0769e m784d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0041d.f331B);
        try {
            String string = typedArrayObtainAttributes.getString(AbstractC0041d.f332C);
            String string2 = typedArrayObtainAttributes.getString(AbstractC0041d.f333D);
            String string3 = typedArrayObtainAttributes.getString(AbstractC0041d.f334E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                m788h(xmlPullParser);
            }
            C0769e c0769e = new C0769e(str, str2, string, list, string2, string3);
            typedArrayObtainAttributes.recycle();
            return c0769e;
        } catch (Throwable th) {
            if (typedArrayObtainAttributes == null) {
                throw th;
            }
            try {
                typedArrayObtainAttributes.recycle();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static b m785e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m786f(xmlPullParser, resources);
        }
        m788h(xmlPullParser);
        return null;
    }

    /* JADX INFO: renamed from: f */
    private static b m786f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0041d.f358h);
        String string = typedArrayObtainAttributes.getString(AbstractC0041d.f359i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC0041d.f364n);
        String string3 = typedArrayObtainAttributes.getString(AbstractC0041d.f365o);
        String string4 = typedArrayObtainAttributes.getString(AbstractC0041d.f361k);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC0041d.f360j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC0041d.f362l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC0041d.f363m, 500);
        String string5 = typedArrayObtainAttributes.getString(AbstractC0041d.f366p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m787g(xmlPullParser, resources));
                    } else {
                        m788h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listM783c = m783c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(m784d(xmlPullParser, resources, string, string2, listM783c));
                } else {
                    m788h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new C0769e(string, string2, string3, listM783c, null, null));
        if (string4 != null) {
            arrayList2.add(new C0769e(string, string2, string4, listM783c, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    /* JADX INFO: renamed from: g */
    private static d m787g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0041d.f367q);
        int i7 = AbstractC0041d.f376z;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = AbstractC0041d.f369s;
        }
        int i8 = typedArrayObtainAttributes.getInt(i7, 400);
        int i9 = AbstractC0041d.f374x;
        if (!typedArrayObtainAttributes.hasValue(i9)) {
            i9 = AbstractC0041d.f370t;
        }
        boolean z7 = 1 == typedArrayObtainAttributes.getInt(i9, 0);
        int i10 = AbstractC0041d.f330A;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = AbstractC0041d.f371u;
        }
        int i11 = AbstractC0041d.f375y;
        if (!typedArrayObtainAttributes.hasValue(i11)) {
            i11 = AbstractC0041d.f372v;
        }
        String string = typedArrayObtainAttributes.getString(i11);
        int i12 = typedArrayObtainAttributes.getInt(i10, 0);
        int i13 = AbstractC0041d.f373w;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = AbstractC0041d.f368r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m788h(xmlPullParser);
        }
        return new d(string2, i8, z7, string, i12, resourceId);
    }

    /* JADX INFO: renamed from: h */
    private static void m788h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static List m789i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
