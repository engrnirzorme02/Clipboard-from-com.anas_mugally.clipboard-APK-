package p055G5;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p047F5.InterfaceC0434b;

/* JADX INFO: renamed from: G5.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486a {
    /* JADX INFO: renamed from: a */
    public static List m2085a(View view) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(view);
        while (!linkedList2.isEmpty()) {
            KeyEvent.Callback callback = (View) linkedList2.remove();
            if (callback instanceof InterfaceC0434b) {
                linkedList.add((InterfaceC0434b) callback);
            } else if (callback instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) callback;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    linkedList2.add(viewGroup.getChildAt(childCount));
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: b */
    public static void m2086b(List list, float f7) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC0434b) it.next()).mo1870e(f7);
        }
    }
}
