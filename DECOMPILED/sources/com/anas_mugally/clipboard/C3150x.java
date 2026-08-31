package com.anas_mugally.clipboard;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1435m;
import p152T5.C1630i;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.x */
/* JADX INFO: loaded from: classes.dex */
public final class C3150x {

    /* JADX INFO: renamed from: a */
    private List f13215a = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final void m16730e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z7, ArrayList arrayList, boolean z8) {
        if (accessibilityNodeInfo.isVisibleToUser()) {
            CharSequence text = accessibilityNodeInfo.getText();
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            if ((text != null && text.length() != 0) || (contentDescription != null && contentDescription.length() != 0)) {
                if (text == null) {
                    text = contentDescription;
                }
                String string = text.toString();
                if (z8) {
                    Rect rect = new Rect();
                    accessibilityNodeInfo.getBoundsInScreen(rect);
                    arrayList.add(new C1435m(string, rect));
                } else if (!AbstractC6118n.m27183a(accessibilityNodeInfo.getPackageName(), "com.android.systemui")) {
                    arrayList.add(new C1435m(string, accessibilityNodeInfo.getViewIdResourceName()));
                }
            }
            if (z7 && accessibilityNodeInfo.isEditable()) {
                this.f13215a.add(accessibilityNodeInfo);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final List m16731f(List list, boolean z7, boolean z8) {
        if (z7) {
            Iterator it = this.f13215a.iterator();
            while (it.hasNext()) {
                ((AccessibilityNodeInfo) it.next()).recycle();
            }
            this.f13215a.clear();
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AccessibilityNodeInfo accessibilityNodeInfo = (AccessibilityNodeInfo) it2.next();
                try {
                    C1630i c1630i = new C1630i();
                    c1630i.add(accessibilityNodeInfo);
                    while (!c1630i.isEmpty()) {
                        AccessibilityNodeInfo accessibilityNodeInfo2 = (AccessibilityNodeInfo) c1630i.removeLast();
                        m16730e(accessibilityNodeInfo2, z7, arrayList, z8);
                        for (int childCount = accessibilityNodeInfo2.getChildCount() - 1; -1 < childCount; childCount--) {
                            AccessibilityNodeInfo child = accessibilityNodeInfo2.getChild(childCount);
                            if (child != null) {
                                c1630i.add(child);
                            }
                        }
                        if (!z7 || !accessibilityNodeInfo2.isEditable()) {
                            accessibilityNodeInfo2.recycle();
                        }
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m16732a(List list) {
        List listM16731f = m16731f(list, false, false);
        AbstractC6118n.m27185c(listM16731f, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Pair<kotlin.String, kotlin.String?>>");
        return listM16731f;
    }

    /* JADX INFO: renamed from: b */
    public final List m16733b(List list, boolean z7) {
        List listM16731f = m16731f(list, z7, true);
        AbstractC6118n.m27185c(listM16731f, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Pair<kotlin.String, android.graphics.Rect>>");
        return listM16731f;
    }

    /* JADX INFO: renamed from: c */
    public final C1435m m16734c(List nodes, int i7, int i8) {
        Object next;
        AbstractC6118n.m27187e(nodes, "nodes");
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : nodes) {
                if (((Rect) ((C1435m) obj).m6071d()).contains(i7, i8)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    C1435m c1435m = (C1435m) next;
                    int iWidth = ((Rect) c1435m.m6071d()).width() * ((Rect) c1435m.m6071d()).height();
                    do {
                        Object next2 = it.next();
                        C1435m c1435m2 = (C1435m) next2;
                        int iWidth2 = ((Rect) c1435m2.m6071d()).width() * ((Rect) c1435m2.m6071d()).height();
                        if (iWidth > iWidth2) {
                            next = next2;
                            iWidth = iWidth2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            return (C1435m) next;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final List m16735d() {
        return this.f13215a;
    }
}
