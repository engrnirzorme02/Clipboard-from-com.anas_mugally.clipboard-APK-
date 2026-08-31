package p281k1;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.TextDialogActivity;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6128x;
import kotlin.jvm.internal.C6129y;
import p000.C5446g;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p302m6.AbstractC6406h;
import p371v1.C7213n;

/* JADX INFO: renamed from: k1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C5915F {

    /* JADX INFO: renamed from: j */
    public static final a f23488j = new a(null);

    /* JADX INFO: renamed from: k */
    private static volatile C5915F f23489k;

    /* JADX INFO: renamed from: a */
    private ActionsLayout f23490a;

    /* JADX INFO: renamed from: b */
    private final Runnable f23491b;

    /* JADX INFO: renamed from: c */
    private final MyAccessibilityService f23492c;

    /* JADX INFO: renamed from: d */
    private WindowManager f23493d;

    /* JADX INFO: renamed from: e */
    private CardView f23494e;

    /* JADX INFO: renamed from: f */
    private int f23495f;

    /* JADX INFO: renamed from: g */
    private float f23496g;

    /* JADX INFO: renamed from: h */
    private final int f23497h;

    /* JADX INFO: renamed from: i */
    private final InterfaceC1429g f23498i;

    /* JADX INFO: renamed from: k1.F$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5915F m26698a() {
            C5915F c5915f;
            C5915F c5915f2 = C5915F.f23489k;
            if (c5915f2 != null) {
                return c5915f2;
            }
            synchronized (this) {
                c5915f = C5915F.f23489k;
                if (c5915f == null) {
                    c5915f = new C5915F(null);
                    C5915F.f23489k = c5915f;
                }
            }
            return c5915f;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: k1.F$b */
    public static final class b implements C7213n.a {
        b() {
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: a */
        public void mo15502a(String error) {
            AbstractC6118n.m27187e(error, "error");
            Toast.makeText(C5915F.this.f23492c, error, 0).show();
        }

        @Override // p371v1.C7213n.a
        /* JADX INFO: renamed from: b */
        public void mo15503b(String categoryName) {
            AbstractC6118n.m27187e(categoryName, "categoryName");
            Toast.makeText(C5915F.this.f23492c, C5915F.this.f23492c.getString(R.string.done_add_to_clipboard, categoryName), 0).show();
            C5915F.this.m26689u();
        }
    }

    public /* synthetic */ C5915F(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m26666A(C5915F c5915f, String str, MenuItem menuItem) {
        AbstractC6118n.m27187e(menuItem, "menuItem");
        if (menuItem.getItemId() == R.id.save) {
            c5915f.m26688t(menuItem.getItemId(), str);
            return true;
        }
        new C5920K(c5915f.f23492c, str, false).m26716i(menuItem.getItemId());
        c5915f.m26689u();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final boolean m26667B(CardView cardView, C5915F c5915f, C6129y c6129y, C6129y c6129y2, C6128x c6128x, C6129y c6129y3, View view, MotionEvent event) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(event, "event");
        int action = event.getAction();
        if (action == 0) {
            cardView.setAlpha(1.0f);
            cardView.removeCallbacks(c5915f.f23491b);
            c6129y.f23886a = event.getRawX();
            c6129y2.f23886a = event.getRawY();
            c6128x.f23885a = false;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (c5915f.f23495f != 2) {
                    float rawX = event.getRawX() - c6129y.f23886a;
                    float rawY = event.getRawY() - c6129y2.f23886a;
                    if (Math.abs(rawX) > 10.0f || Math.abs(rawY) > 10.0f) {
                        if (!c6128x.f23885a) {
                            c6128x.f23885a = true;
                        }
                        cardView.setX(c6129y3.f23886a + rawX);
                        cardView.setAlpha(1.0f - Math.min(Math.abs(rawX) / 500.0f, 0.9f));
                    }
                }
                return true;
            }
            if (action != 3) {
                if (action != 4) {
                    return false;
                }
                c5915f.m26689u();
                return false;
            }
        }
        if (Math.abs(cardView.getX() - c6129y3.f23886a) > 100.0f) {
            c5915f.m26689u();
        } else if (c6128x.f23885a) {
            cardView.animate().x(c6129y3.f23886a).alpha(0.9f).setDuration(150L).withEndAction(new Runnable() { // from class: k1.E
                @Override // java.lang.Runnable
                public final void run() {
                    C5915F.m26668C();
                }
            }).start();
        } else {
            view.performClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m26668C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final boolean m26669D(InterfaceC5371p interfaceC5371p, View view, MotionEvent motionEvent) {
        AbstractC6118n.m27184b(view);
        AbstractC6118n.m27184b(motionEvent);
        return ((Boolean) interfaceC5371p.invoke(view, motionEvent)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final boolean m26670E(InterfaceC5371p interfaceC5371p, View view, MotionEvent motionEvent) {
        AbstractC6118n.m27184b(view);
        AbstractC6118n.m27184b(motionEvent);
        return ((Boolean) interfaceC5371p.invoke(view, motionEvent)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final int m26671F() {
        return C3034A.f12453a.m15050y(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m26686r(C5915F c5915f) {
        c5915f.m26689u();
    }

    /* JADX INFO: renamed from: s */
    private final int m26687s() {
        return ((Number) this.f23498i.getValue()).intValue();
    }

    /* JADX INFO: renamed from: t */
    private final void m26688t(int i7, String str) {
        Context context;
        ActionsLayout actionsLayout;
        Map<Integer, ImageButton> itemViewMap;
        ImageButton imageButton;
        ActionsLayout actionsLayout2 = this.f23490a;
        if (actionsLayout2 == null || (context = actionsLayout2.getContext()) == null || (actionsLayout = this.f23490a) == null || (itemViewMap = actionsLayout.getItemViewMap()) == null || (imageButton = itemViewMap.get(Integer.valueOf(i7))) == null) {
            return;
        }
        new C7213n(context, AppDatabase.f12597p.m15148b(this.f23492c)).m31850m(imageButton, str, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final void m26689u() {
        WindowManager windowManager;
        try {
            CardView cardView = this.f23494e;
            if (cardView != null) {
                cardView.removeCallbacks(this.f23491b);
                if (cardView.isAttachedToWindow() && (windowManager = this.f23493d) != null) {
                    windowManager.removeView(cardView);
                }
                this.f23494e = null;
                this.f23490a = null;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m26690w(final String str) {
        Map<Integer, ImageButton> itemViewMap;
        m26689u();
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(this.f23492c, R.style.Theme_ClipboardTextSaved)).inflate(R.layout.view_clipboard_toast, (ViewGroup) null);
        AbstractC6118n.m27185c(viewInflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        final CardView cardView = (CardView) viewInflate;
        this.f23494e = cardView;
        cardView.setAlpha(0.9f);
        TextView textView = (TextView) cardView.findViewById(R.id.text);
        textView.setText(AbstractC6406h.m27551E(str, "\n", " ", false, 4, null));
        textView.setOnClickListener(new View.OnClickListener() { // from class: k1.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5915F.m26692y(this.f23699a, str, view);
            }
        });
        ActionsLayout actionsLayout = (ActionsLayout) cardView.findViewById(R.id.toolbar);
        this.f23490a = actionsLayout;
        if (actionsLayout != null) {
            actionsLayout.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: k1.w
                @Override // p238e6.InterfaceC5371p
                public final Object invoke(Object obj, Object obj2) {
                    return C5915F.m26693z(this.f23701a, str, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
                }
            });
        }
        ActionsLayout actionsLayout2 = this.f23490a;
        if (actionsLayout2 != null) {
            actionsLayout2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: k1.x
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return C5915F.m26666A(this.f23703a, str, menuItem);
                }
            });
        }
        final C6129y c6129y = new C6129y();
        final C6129y c6129y2 = new C6129y();
        final C6129y c6129y3 = new C6129y();
        final C6128x c6128x = new C6128x();
        final InterfaceC5371p interfaceC5371p = new InterfaceC5371p() { // from class: k1.y
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C5915F.m26667B(cardView, this, c6129y2, c6129y3, c6128x, c6129y, (View) obj, (MotionEvent) obj2));
            }
        };
        cardView.setOnTouchListener(new View.OnTouchListener() { // from class: k1.z
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5915F.m26669D(interfaceC5371p, view, motionEvent);
            }
        });
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: k1.A
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5915F.m26670E(interfaceC5371p, view, motionEvent);
            }
        });
        ActionsLayout actionsLayout3 = this.f23490a;
        if (actionsLayout3 != null && (itemViewMap = actionsLayout3.getItemViewMap()) != null) {
            Iterator<Map.Entry<Integer, ImageButton>> it = itemViewMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().setOnTouchListener(new View.OnTouchListener() { // from class: k1.B
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return C5915F.m26691x(interfaceC5371p, view, motionEvent);
                    }
                });
            }
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = m26687s();
        layoutParams.format = -3;
        layoutParams.flags = 262920;
        layoutParams.width = this.f23495f == 2 ? this.f23497h : (int) (((double) this.f23492c.getResources().getDisplayMetrics().widthPixels) * 0.99d);
        int i7 = this.f23495f;
        if (i7 == 0) {
            layoutParams.gravity = 49;
            C3034A c3034a = C3034A.f12453a;
            Context baseContext = this.f23492c.getBaseContext();
            AbstractC6118n.m27186d(baseContext, "getBaseContext(...)");
            layoutParams.y = c3034a.m15016C(baseContext);
            cardView.setRadius(c3034a.m15020G(this.f23492c, 3));
        } else if (i7 == 1) {
            layoutParams.gravity = 81;
            C3034A c3034a2 = C3034A.f12453a;
            layoutParams.y = c3034a2.m15049x(this.f23492c) + c3034a2.m15020G(this.f23492c, 10);
            cardView.setRadius(c3034a2.m15020G(this.f23492c, 3));
        } else if (i7 == 2) {
            layoutParams.gravity = 81;
            layoutParams.y = (int) (this.f23492c.getResources().getDisplayMetrics().heightPixels * (this.f23496g / 100));
            cardView.setRadius(C3034A.f12453a.m15020G(this.f23492c, 20));
        }
        layoutParams.height = -2;
        try {
            WindowManager windowManager = this.f23493d;
            if (windowManager != null) {
                windowManager.addView(this.f23494e, layoutParams);
            }
            cardView.postDelayed(this.f23491b, 3500L);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m26691x(InterfaceC5371p interfaceC5371p, View view, MotionEvent motionEvent) {
        AbstractC6118n.m27184b(view);
        AbstractC6118n.m27184b(motionEvent);
        return ((Boolean) interfaceC5371p.invoke(view, motionEvent)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m26692y(C5915F c5915f, String str, View view) {
        c5915f.m26689u();
        C5446g.f20735a.m24651e(c5915f.f23492c, str, new ComponentName(c5915f.f23492c, (Class<?>) TextDialogActivity.class), ActionsLayout.EnumC3037c.SHARE, 1350565888);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C1444v m26693z(C5915F c5915f, String str, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        C5446g.m24648f(C5446g.f20735a, c5915f.f23492c, str, componentName, type, 0, 8, null);
        c5915f.m26689u();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: o */
    public final void m26694o(float f7) {
        this.f23496g = f7;
    }

    /* JADX INFO: renamed from: p */
    public final void m26695p(int i7) {
        this.f23495f = i7;
    }

    /* JADX INFO: renamed from: q */
    public final void m26696q() {
        m26689u();
        this.f23493d = null;
        f23489k = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m26697v(String text) {
        AbstractC6118n.m27187e(text, "text");
        if (text.length() > 0) {
            m26690w(text);
        }
    }

    private C5915F() {
        this.f23491b = new Runnable() { // from class: k1.C
            @Override // java.lang.Runnable
            public final void run() {
                C5915F.m26686r(this.f23487a);
            }
        };
        MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
        AbstractC6118n.m27184b(myAccessibilityServiceM15245a);
        this.f23492c = myAccessibilityServiceM15245a;
        this.f23495f = 2;
        this.f23496g = 35.0f;
        this.f23497h = (int) (((double) myAccessibilityServiceM15245a.getResources().getDisplayMetrics().widthPixels) * 0.7d);
        Object systemService = myAccessibilityServiceM15245a.getSystemService("window");
        AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f23493d = (WindowManager) systemService;
        SharedPreferences sharedPreferences = myAccessibilityServiceM15245a.getSharedPreferences("SHARED_NAME", 0);
        C3034A c3034a = C3034A.f12453a;
        this.f23495f = sharedPreferences.getInt(c3034a.m15038l(), 2);
        this.f23496g = myAccessibilityServiceM15245a.getSharedPreferences("SHARED_NAME", 0).getFloat(c3034a.m15036j(), 35.0f);
        this.f23498i = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: k1.D
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return Integer.valueOf(C5915F.m26671F());
            }
        });
    }
}
