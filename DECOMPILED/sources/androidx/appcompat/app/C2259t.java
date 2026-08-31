package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.appcompat.app.t */
/* JADX INFO: loaded from: classes.dex */
class C2259t {

    /* JADX INFO: renamed from: a */
    private final Deque f7451a = new ArrayDeque();

    C2259t() {
    }

    /* JADX INFO: renamed from: b */
    private static boolean m9314b(XmlPullParser xmlPullParser) {
        if (xmlPullParser != null) {
            try {
                if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                    return false;
                }
            } catch (XmlPullParserException unused) {
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    private static XmlPullParser m9315c(Deque deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = (XmlPullParser) ((WeakReference) deque.peek()).get();
            if (!m9314b(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m9316d(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    boolean m9317a(AttributeSet attributeSet) {
        if (!(attributeSet instanceof XmlPullParser)) {
            return false;
        }
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (xmlPullParser.getDepth() != 1) {
            return false;
        }
        XmlPullParser xmlPullParserM9315c = m9315c(this.f7451a);
        this.f7451a.push(new WeakReference(xmlPullParser));
        return m9316d(xmlPullParser, xmlPullParserM9315c);
    }
}
