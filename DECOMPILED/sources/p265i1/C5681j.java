package p265i1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1435m;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: i1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5681j extends View {

    /* JADX INFO: renamed from: a */
    private Boolean f21688a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1429g f21689b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1429g f21690c;

    /* JADX INFO: renamed from: d */
    private Rect f21691d;

    /* JADX INFO: renamed from: e */
    private List f21692e;

    /* JADX INFO: renamed from: f */
    private List f21693f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5681j(Context context) {
        super(context);
        AbstractC6118n.m27187e(context, "context");
        this.f21689b = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: i1.h
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C5681j.m25219c();
            }
        });
        this.f21690c = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: i1.i
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C5681j.m25220d();
            }
        });
        this.f21693f = AbstractC1638q.m6765j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Paint m25219c() {
        Paint paint = new Paint();
        paint.setColor(-256);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Paint m25220d() {
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* JADX INFO: renamed from: e */
    private final Rect m25221e(Rect rect) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i7 = rect.left;
        int i8 = iArr[0];
        int i9 = rect.top;
        int i10 = iArr[1];
        return new Rect(i7 - i8, i9 - i10, rect.right - i8, rect.bottom - i10);
    }

    private final Paint getDefaultPaint() {
        return (Paint) this.f21689b.getValue();
    }

    private final Paint getEditablePaint() {
        return (Paint) this.f21690c.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m25222f(Boolean bool, Rect rect) {
        this.f21692e = null;
        this.f21691d = rect;
        this.f21688a = bool;
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public final void m25223g(List newBounds) {
        AbstractC6118n.m27187e(newBounds, "newBounds");
        this.f21691d = null;
        this.f21692e = newBounds;
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final void m25224h(List selectedNode) {
        AbstractC6118n.m27187e(selectedNode, "selectedNode");
        this.f21693f = selectedNode;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC6118n.m27187e(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.f21691d;
        if (rect != null) {
            AbstractC6118n.m27184b(rect);
            canvas.drawRect(m25221e(rect), !AbstractC6118n.m27183a(this.f21688a, Boolean.TRUE) ? getDefaultPaint() : getEditablePaint());
            return;
        }
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setAlpha(128);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        List list = this.f21693f;
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Rect) ((C1435m) it.next()).m6071d());
        }
        List<Rect> list2 = this.f21692e;
        if (list2 != null) {
            for (Rect rect2 : list2) {
                canvas.drawRect(m25221e(rect2), arrayList.contains(rect2) ? paint : getDefaultPaint());
            }
        }
    }
}
