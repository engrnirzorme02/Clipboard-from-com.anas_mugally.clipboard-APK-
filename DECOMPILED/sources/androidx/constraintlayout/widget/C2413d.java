package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C2413d {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f8656a;

    /* JADX INFO: renamed from: b */
    int f8657b = -1;

    /* JADX INFO: renamed from: c */
    int f8658c = -1;

    /* JADX INFO: renamed from: d */
    private SparseArray f8659d = new SparseArray();

    /* JADX INFO: renamed from: e */
    private SparseArray f8660e = new SparseArray();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a */
    static class a {

        /* JADX INFO: renamed from: a */
        int f8661a;

        /* JADX INFO: renamed from: b */
        ArrayList f8662b = new ArrayList();

        /* JADX INFO: renamed from: c */
        int f8663c;

        /* JADX INFO: renamed from: d */
        C2414e f8664d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f8663c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2418i.f8821B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f8829C6) {
                    this.f8661a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8661a);
                } else if (index == AbstractC2418i.f8837D6) {
                    this.f8663c = typedArrayObtainStyledAttributes.getResourceId(index, this.f8663c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8663c);
                    context.getResources().getResourceName(this.f8663c);
                    if ("layout".equals(resourceTypeName)) {
                        C2414e c2414e = new C2414e();
                        this.f8664d = c2414e;
                        c2414e.m10417e(context, this.f8663c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        void m10403a(b bVar) {
            this.f8662b.add(bVar);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$b */
    static class b {

        /* JADX INFO: renamed from: a */
        float f8665a;

        /* JADX INFO: renamed from: b */
        float f8666b;

        /* JADX INFO: renamed from: c */
        float f8667c;

        /* JADX INFO: renamed from: d */
        float f8668d;

        /* JADX INFO: renamed from: e */
        int f8669e;

        /* JADX INFO: renamed from: f */
        C2414e f8670f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f8665a = Float.NaN;
            this.f8666b = Float.NaN;
            this.f8667c = Float.NaN;
            this.f8668d = Float.NaN;
            this.f8669e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC2418i.f8973U6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == AbstractC2418i.f8981V6) {
                    this.f8669e = typedArrayObtainStyledAttributes.getResourceId(index, this.f8669e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8669e);
                    context.getResources().getResourceName(this.f8669e);
                    if ("layout".equals(resourceTypeName)) {
                        C2414e c2414e = new C2414e();
                        this.f8670f = c2414e;
                        c2414e.m10417e(context, this.f8669e);
                    }
                } else if (index == AbstractC2418i.f8989W6) {
                    this.f8668d = typedArrayObtainStyledAttributes.getDimension(index, this.f8668d);
                } else if (index == AbstractC2418i.f8997X6) {
                    this.f8666b = typedArrayObtainStyledAttributes.getDimension(index, this.f8666b);
                } else if (index == AbstractC2418i.f9005Y6) {
                    this.f8667c = typedArrayObtainStyledAttributes.getDimension(index, this.f8667c);
                } else if (index == AbstractC2418i.f9013Z6) {
                    this.f8665a = typedArrayObtainStyledAttributes.getDimension(index, this.f8665a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    C2413d(Context context, ConstraintLayout constraintLayout, int i7) {
        this.f8656a = constraintLayout;
        m10400a(context, i7);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    private void m10400a(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                byte b7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b7 = -1;
                            } else {
                                b7 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b7 = -1;
                            } else {
                                b7 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b7 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b7 = -1;
                            } else {
                                b7 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b7 = -1;
                            } else {
                                b7 = 3;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 2) {
                        a aVar2 = new a(context, xml);
                        this.f8659d.put(aVar2.f8661a, aVar2);
                        aVar = aVar2;
                    } else if (b7 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.m10403a(bVar);
                        }
                    } else if (b7 == 4) {
                        m10401b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e7) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i7, e7);
        } catch (XmlPullParserException e8) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i7, e8);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m10401b(Context context, XmlPullParser xmlPullParser) {
        C2414e c2414e = new C2414e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c2414e.m10421l(context, xmlPullParser);
                this.f8660e.put(identifier, c2414e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m10402c(AbstractC2415f abstractC2415f) {
    }
}
