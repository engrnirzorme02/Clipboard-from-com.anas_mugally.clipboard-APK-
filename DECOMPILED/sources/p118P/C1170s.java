package p118P;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: P.s */
/* JADX INFO: loaded from: classes.dex */
public class C1170s {

    /* JADX INFO: renamed from: a */
    private final AccessibilityNodeInfo f4084a;

    /* JADX INFO: renamed from: b */
    public int f4085b = -1;

    /* JADX INFO: renamed from: c */
    private int f4086c = -1;

    /* JADX INFO: renamed from: P.s$a */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final a f4087A;

        /* JADX INFO: renamed from: B */
        public static final a f4088B;

        /* JADX INFO: renamed from: C */
        public static final a f4089C;

        /* JADX INFO: renamed from: D */
        public static final a f4090D;

        /* JADX INFO: renamed from: E */
        public static final a f4091E;

        /* JADX INFO: renamed from: F */
        public static final a f4092F;

        /* JADX INFO: renamed from: G */
        public static final a f4093G;

        /* JADX INFO: renamed from: H */
        public static final a f4094H;

        /* JADX INFO: renamed from: I */
        public static final a f4095I;

        /* JADX INFO: renamed from: J */
        public static final a f4096J;

        /* JADX INFO: renamed from: K */
        public static final a f4097K;

        /* JADX INFO: renamed from: L */
        public static final a f4098L;

        /* JADX INFO: renamed from: M */
        public static final a f4099M;

        /* JADX INFO: renamed from: N */
        public static final a f4100N;

        /* JADX INFO: renamed from: O */
        public static final a f4101O;

        /* JADX INFO: renamed from: P */
        public static final a f4102P;

        /* JADX INFO: renamed from: Q */
        public static final a f4103Q;

        /* JADX INFO: renamed from: R */
        public static final a f4104R;

        /* JADX INFO: renamed from: S */
        public static final a f4105S;

        /* JADX INFO: renamed from: T */
        public static final a f4106T;

        /* JADX INFO: renamed from: U */
        public static final a f4107U;

        /* JADX INFO: renamed from: V */
        public static final a f4108V;

        /* JADX INFO: renamed from: e */
        public static final a f4109e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f4110f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f4111g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f4112h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f4113i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f4114j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f4115k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f4116l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f4117m = new a(256, (CharSequence) null, InterfaceC1173v.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f4118n = new a(512, (CharSequence) null, InterfaceC1173v.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f4119o = new a(1024, (CharSequence) null, InterfaceC1173v.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f4120p = new a(2048, (CharSequence) null, InterfaceC1173v.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f4121q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f4122r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f4123s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f4124t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f4125u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f4126v = new a(131072, (CharSequence) null, InterfaceC1173v.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f4127w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f4128x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f4129y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f4130z = new a(2097152, (CharSequence) null, InterfaceC1173v.h.class);

        /* JADX INFO: renamed from: a */
        final Object f4131a;

        /* JADX INFO: renamed from: b */
        private final int f4132b;

        /* JADX INFO: renamed from: c */
        private final Class f4133c;

        /* JADX INFO: renamed from: d */
        protected final InterfaceC1173v f4134d;

        static {
            int i7 = Build.VERSION.SDK_INT;
            f4087A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f4088B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC1173v.e.class);
            f4089C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f4090D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f4091E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f4092F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f4093G = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f4094H = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f4095I = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f4096J = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f4097K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f4098L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC1173v.f.class);
            f4099M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC1173v.d.class);
            f4100N = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f4101O = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f4102P = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f4103Q = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f4104R = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f4105S = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f4106T = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f4107U = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f4108V = new a(i7 >= 34 ? d.m5101a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        /* JADX INFO: renamed from: a */
        public a m5093a(CharSequence charSequence, InterfaceC1173v interfaceC1173v) {
            return new a(null, this.f4132b, charSequence, interfaceC1173v, this.f4133c);
        }

        /* JADX INFO: renamed from: b */
        public int m5094b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4131a).getId();
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m5095c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f4131a).getLabel();
        }

        /* JADX INFO: renamed from: d */
        public boolean m5096d(View view, Bundle bundle) {
            if (this.f4134d == null) {
                return false;
            }
            Class cls = this.f4133c;
            if (cls != null) {
                try {
                    AbstractC2263x.m9328a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e7) {
                    Class cls2 = this.f4133c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e7);
                }
            }
            return this.f4134d.mo3201a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f4131a;
            if (obj2 == null) {
                return aVar.f4131a == null;
            }
            return obj2.equals(aVar.f4131a);
        }

        public int hashCode() {
            Object obj = this.f4131a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strM5003h = C1170s.m5003h(this.f4132b);
            if (strM5003h.equals("ACTION_UNKNOWN") && m5095c() != null) {
                strM5003h = m5095c().toString();
            }
            sb.append(strM5003h);
            return sb.toString();
        }

        public a(int i7, CharSequence charSequence, InterfaceC1173v interfaceC1173v) {
            this(null, i7, charSequence, interfaceC1173v, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i7, CharSequence charSequence, Class cls) {
            this(null, i7, charSequence, null, cls);
        }

        a(Object obj, int i7, CharSequence charSequence, InterfaceC1173v interfaceC1173v, Class cls) {
            this.f4132b = i7;
            this.f4134d = interfaceC1173v;
            if (obj == null) {
                this.f4131a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
            } else {
                this.f4131a = obj;
            }
            this.f4133c = cls;
        }
    }

    /* JADX INFO: renamed from: P.s$b */
    private static class b {
        /* JADX INFO: renamed from: a */
        public static CharSequence m5097a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m5098b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: P.s$c */
    private static class c {
        /* JADX INFO: renamed from: a */
        public static String m5099a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m5100b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: P.s$d */
    private static class d {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m5101a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* JADX INFO: renamed from: b */
        public static void m5102b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m5103c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m5104d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: renamed from: P.s$e */
    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static int m5106b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        /* JADX INFO: renamed from: c */
        public static int m5107c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        /* JADX INFO: renamed from: d */
        public static CharSequence m5108d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m5109e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: renamed from: P.s$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        final Object f4135a;

        f(Object obj) {
            this.f4135a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m5110a(int i7, int i8, boolean z7) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z7));
        }

        /* JADX INFO: renamed from: b */
        public static f m5111b(int i7, int i8, boolean z7, int i9) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z7, i9));
        }
    }

    /* JADX INFO: renamed from: P.s$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        final Object f4136a;

        g(Object obj) {
            this.f4136a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m5112a(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z7, z8));
        }
    }

    /* JADX INFO: renamed from: P.s$h */
    public static class h {

        /* JADX INFO: renamed from: a */
        final Object f4137a;

        h(Object obj) {
            this.f4137a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static h m5113a(int i7, float f7, float f8, float f9) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i7, f7, f8, f9));
        }
    }

    private C1170s(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4084a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: G */
    private boolean m4997G() {
        return !m5002f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: R0 */
    public static C1170s m4998R0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1170s(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: a0 */
    public static C1170s m4999a0() {
        return m4998R0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: b0 */
    public static C1170s m5000b0(C1170s c1170s) {
        return m4998R0(AccessibilityNodeInfo.obtain(c1170s.f4084a));
    }

    /* JADX INFO: renamed from: c0 */
    public static C1170s m5001c0(View view) {
        return m4998R0(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: f */
    private List m5002f(String str) {
        ArrayList<Integer> integerArrayList = this.f4084a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f4084a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    static String m5003h(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: h0 */
    private void m5004h0(int i7, boolean z7) {
        Bundle bundleM5087x = m5087x();
        if (bundleM5087x != null) {
            int i8 = bundleM5087x.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z7) {
                i7 = 0;
            }
            bundleM5087x.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m5005j(int i7) {
        Bundle bundleM5087x = m5087x();
        return bundleM5087x != null && (bundleM5087x.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i7) == i7;
    }

    /* JADX INFO: renamed from: o */
    private String m5006o() {
        int iM5070n = m5070n();
        if (iM5070n == 1) {
            return "TRUE";
        }
        return iM5070n == 2 ? "PARTIAL" : "FALSE";
    }

    /* JADX INFO: renamed from: r */
    public static ClickableSpan[] m5007r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    static String m5008w(int i7) {
        if (i7 == 0) {
            return "UNDEFINED";
        }
        if (i7 == 1) {
            return "COLLAPSED";
        }
        if (i7 != 2) {
            return i7 != 3 ? "UNKNOWN" : "FULL";
        }
        return "PARTIAL";
    }

    /* JADX INFO: renamed from: A */
    public CharSequence m5009A() {
        return Build.VERSION.SDK_INT >= 30 ? b.m5097a(this.f4084a) : this.f4084a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: A0 */
    public void m5010A0(CharSequence charSequence) {
        this.f4084a.setPackageName(charSequence);
    }

    /* JADX INFO: renamed from: B */
    public CharSequence m5011B() {
        return Build.VERSION.SDK_INT >= 36 ? e.m5108d(this.f4084a) : this.f4084a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: B0 */
    public void m5012B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4084a.setPaneTitle(charSequence);
        } else {
            this.f4084a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: C */
    public CharSequence m5013C() {
        if (!m4997G()) {
            return this.f4084a.getText();
        }
        List listM5002f = m5002f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listM5002f2 = m5002f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listM5002f3 = m5002f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listM5002f4 = m5002f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4084a.getText(), 0, this.f4084a.getText().length()));
        for (int i7 = 0; i7 < listM5002f.size(); i7++) {
            spannableString.setSpan(new C1152a(((Integer) listM5002f4.get(i7)).intValue(), this, m5087x().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listM5002f.get(i7)).intValue(), ((Integer) listM5002f2.get(i7)).intValue(), ((Integer) listM5002f3.get(i7)).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: C0 */
    public void m5014C0(View view) {
        this.f4085b = -1;
        this.f4084a.setParent(view);
    }

    /* JADX INFO: renamed from: D */
    public CharSequence m5015D() {
        return Build.VERSION.SDK_INT >= 28 ? this.f4084a.getTooltipText() : this.f4084a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: D0 */
    public void m5016D0(View view, int i7) {
        this.f4085b = i7;
        this.f4084a.setParent(view, i7);
    }

    /* JADX INFO: renamed from: E */
    public String m5017E() {
        return Build.VERSION.SDK_INT >= 33 ? c.m5099a(this.f4084a) : this.f4084a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: E0 */
    public void m5018E0(h hVar) {
        this.f4084a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f4137a);
    }

    /* JADX INFO: renamed from: F */
    public String m5019F() {
        return this.f4084a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: F0 */
    public void m5020F0(CharSequence charSequence) {
        this.f4084a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: G0 */
    public void m5021G0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4084a.setScreenReaderFocusable(z7);
        } else {
            m5004h0(1, z7);
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m5022H() {
        return Build.VERSION.SDK_INT >= 34 ? d.m5104d(this.f4084a) : m5005j(64);
    }

    /* JADX INFO: renamed from: H0 */
    public void m5023H0(boolean z7) {
        this.f4084a.setScrollable(z7);
    }

    /* JADX INFO: renamed from: I */
    public boolean m5024I() {
        return this.f4084a.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: I0 */
    public void m5025I0(boolean z7) {
        this.f4084a.setSelected(z7);
    }

    /* JADX INFO: renamed from: J */
    public boolean m5026J() {
        return this.f4084a.isCheckable();
    }

    /* JADX INFO: renamed from: J0 */
    public void m5027J0(boolean z7) {
        this.f4084a.setShowingHintText(z7);
    }

    /* JADX INFO: renamed from: K */
    public boolean m5028K() {
        return this.f4084a.isChecked();
    }

    /* JADX INFO: renamed from: K0 */
    public void m5029K0(View view) {
        this.f4086c = -1;
        this.f4084a.setSource(view);
    }

    /* JADX INFO: renamed from: L */
    public boolean m5030L() {
        return this.f4084a.isClickable();
    }

    /* JADX INFO: renamed from: L0 */
    public void m5031L0(View view, int i7) {
        this.f4086c = i7;
        this.f4084a.setSource(view, i7);
    }

    /* JADX INFO: renamed from: M */
    public boolean m5032M() {
        return this.f4084a.isContextClickable();
    }

    /* JADX INFO: renamed from: M0 */
    public void m5033M0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m5098b(this.f4084a, charSequence);
        } else {
            this.f4084a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m5034N() {
        return this.f4084a.isEnabled();
    }

    /* JADX INFO: renamed from: N0 */
    public void m5035N0(CharSequence charSequence) {
        this.f4084a.setText(charSequence);
    }

    /* JADX INFO: renamed from: O */
    public boolean m5036O() {
        return Build.VERSION.SDK_INT >= 36 ? e.m5109e(this.f4084a) : this.f4084a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    /* JADX INFO: renamed from: O0 */
    public void m5037O0(View view) {
        this.f4084a.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: P */
    public boolean m5038P() {
        return this.f4084a.isFocusable();
    }

    /* JADX INFO: renamed from: P0 */
    public void m5039P0(boolean z7) {
        this.f4084a.setVisibleToUser(z7);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m5040Q() {
        return this.f4084a.isFocused();
    }

    /* JADX INFO: renamed from: Q0 */
    public AccessibilityNodeInfo m5041Q0() {
        return this.f4084a;
    }

    /* JADX INFO: renamed from: R */
    public boolean m5042R() {
        return m5005j(67108864);
    }

    /* JADX INFO: renamed from: S */
    public boolean m5043S() {
        return this.f4084a.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: T */
    public boolean m5044T() {
        return this.f4084a.isLongClickable();
    }

    /* JADX INFO: renamed from: U */
    public boolean m5045U() {
        return this.f4084a.isPassword();
    }

    /* JADX INFO: renamed from: V */
    public boolean m5046V() {
        return this.f4084a.isScrollable();
    }

    /* JADX INFO: renamed from: W */
    public boolean m5047W() {
        return this.f4084a.isSelected();
    }

    /* JADX INFO: renamed from: X */
    public boolean m5048X() {
        return this.f4084a.isShowingHintText();
    }

    /* JADX INFO: renamed from: Y */
    public boolean m5049Y() {
        return Build.VERSION.SDK_INT >= 33 ? c.m5100b(this.f4084a) : m5005j(8388608);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m5050Z() {
        return this.f4084a.isVisibleToUser();
    }

    /* JADX INFO: renamed from: a */
    public void m5051a(int i7) {
        this.f4084a.addAction(i7);
    }

    /* JADX INFO: renamed from: b */
    public void m5052b(a aVar) {
        this.f4084a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4131a);
    }

    /* JADX INFO: renamed from: c */
    public void m5053c(View view) {
        this.f4084a.addChild(view);
    }

    /* JADX INFO: renamed from: d */
    public void m5054d(View view, int i7) {
        this.f4084a.addChild(view, i7);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m5055d0(int i7, Bundle bundle) {
        return this.f4084a.performAction(i7, bundle);
    }

    /* JADX INFO: renamed from: e */
    public void m5056e(CharSequence charSequence, View view) {
    }

    /* JADX INFO: renamed from: e0 */
    public void m5057e0() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1170s)) {
            return false;
        }
        C1170s c1170s = (C1170s) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4084a;
        if (accessibilityNodeInfo == null) {
            if (c1170s.f4084a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c1170s.f4084a)) {
            return false;
        }
        return this.f4086c == c1170s.f4086c && this.f4085b == c1170s.f4085b;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m5058f0(a aVar) {
        return this.f4084a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4131a);
    }

    /* JADX INFO: renamed from: g */
    public List m5059g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f4084a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public void m5060g0(boolean z7) {
        this.f4084a.setAccessibilityFocused(z7);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4084a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public int m5061i() {
        return this.f4084a.getActions();
    }

    /* JADX INFO: renamed from: i0 */
    public void m5062i0(Rect rect) {
        this.f4084a.setBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: j0 */
    public void m5063j0(Rect rect) {
        this.f4084a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: k */
    public void m5064k(Rect rect) {
        this.f4084a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: k0 */
    public void m5065k0(boolean z7) {
        this.f4084a.setCheckable(z7);
    }

    /* JADX INFO: renamed from: l */
    public void m5066l(Rect rect) {
        this.f4084a.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: l0 */
    public void m5067l0(boolean z7) {
        this.f4084a.setChecked(z7);
    }

    /* JADX INFO: renamed from: m */
    public void m5068m(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m5102b(this.f4084a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f4084a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m5069m0(CharSequence charSequence) {
        this.f4084a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: n */
    public int m5070n() {
        return Build.VERSION.SDK_INT >= 36 ? e.m5106b(this.f4084a) : this.f4084a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f4084a.isChecked() ? 1 : 0);
    }

    /* JADX INFO: renamed from: n0 */
    public void m5071n0(boolean z7) {
        this.f4084a.setClickable(z7);
    }

    /* JADX INFO: renamed from: o0 */
    public void m5072o0(Object obj) {
        this.f4084a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f4135a);
    }

    /* JADX INFO: renamed from: p */
    public int m5073p() {
        return this.f4084a.getChildCount();
    }

    /* JADX INFO: renamed from: p0 */
    public void m5074p0(Object obj) {
        this.f4084a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f4136a);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m5075q() {
        return this.f4084a.getClassName();
    }

    /* JADX INFO: renamed from: q0 */
    public void m5076q0(CharSequence charSequence) {
        this.f4084a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: r0 */
    public void m5077r0(boolean z7) {
        this.f4084a.setDismissable(z7);
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m5078s() {
        return Build.VERSION.SDK_INT >= 34 ? d.m5103c(this.f4084a) : this.f4084a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: s0 */
    public void m5079s0(boolean z7) {
        this.f4084a.setEnabled(z7);
    }

    /* JADX INFO: renamed from: t */
    public CharSequence m5080t() {
        return this.f4084a.getContentDescription();
    }

    /* JADX INFO: renamed from: t0 */
    public void m5081t0(CharSequence charSequence) {
        this.f4084a.setError(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m5064k(rect);
        sb.append("; boundsInParent: " + rect);
        m5066l(rect);
        sb.append("; boundsInScreen: " + rect);
        m5068m(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m5091z());
        sb.append("; className: ");
        sb.append(m5075q());
        sb.append("; text: ");
        sb.append(m5013C());
        sb.append("; error: ");
        sb.append(m5082u());
        sb.append("; maxTextLength: ");
        sb.append(m5089y());
        sb.append("; stateDescription: ");
        sb.append(m5009A());
        sb.append("; contentDescription: ");
        sb.append(m5080t());
        sb.append("; supplementalDescription: ");
        sb.append(m5011B());
        sb.append("; tooltipText: ");
        sb.append(m5015D());
        sb.append("; viewIdResName: ");
        sb.append(m5019F());
        sb.append("; uniqueId: ");
        sb.append(m5017E());
        sb.append("; checkable: ");
        sb.append(m5026J());
        sb.append("; checked: ");
        sb.append(m5006o());
        sb.append("; fieldRequired: ");
        sb.append(m5036O());
        sb.append("; focusable: ");
        sb.append(m5038P());
        sb.append("; focused: ");
        sb.append(m5040Q());
        sb.append("; selected: ");
        sb.append(m5047W());
        sb.append("; clickable: ");
        sb.append(m5030L());
        sb.append("; longClickable: ");
        sb.append(m5044T());
        sb.append("; contextClickable: ");
        sb.append(m5032M());
        sb.append("; expandedState: ");
        sb.append(m5008w(m5084v()));
        sb.append("; enabled: ");
        sb.append(m5034N());
        sb.append("; password: ");
        sb.append(m5045U());
        sb.append("; scrollable: " + m5046V());
        sb.append("; containerTitle: ");
        sb.append(m5078s());
        sb.append("; granularScrollingSupported: ");
        sb.append(m5042R());
        sb.append("; importantForAccessibility: ");
        sb.append(m5043S());
        sb.append("; visible: ");
        sb.append(m5050Z());
        sb.append("; isTextSelectable: ");
        sb.append(m5049Y());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m5022H());
        sb.append("; [");
        List listM5059g = m5059g();
        for (int i7 = 0; i7 < listM5059g.size(); i7++) {
            a aVar = (a) listM5059g.get(i7);
            String strM5003h = m5003h(aVar.m5094b());
            if (strM5003h.equals("ACTION_UNKNOWN") && aVar.m5095c() != null) {
                strM5003h = aVar.m5095c().toString();
            }
            sb.append(strM5003h);
            if (i7 != listM5059g.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m5082u() {
        return this.f4084a.getError();
    }

    /* JADX INFO: renamed from: u0 */
    public void m5083u0(boolean z7) {
        this.f4084a.setFocusable(z7);
    }

    /* JADX INFO: renamed from: v */
    public int m5084v() {
        return Build.VERSION.SDK_INT >= 36 ? e.m5107c(this.f4084a) : this.f4084a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    /* JADX INFO: renamed from: v0 */
    public void m5085v0(boolean z7) {
        this.f4084a.setFocused(z7);
    }

    /* JADX INFO: renamed from: w0 */
    public void m5086w0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4084a.setHeading(z7);
        } else {
            m5004h0(2, z7);
        }
    }

    /* JADX INFO: renamed from: x */
    public Bundle m5087x() {
        return this.f4084a.getExtras();
    }

    /* JADX INFO: renamed from: x0 */
    public void m5088x0(CharSequence charSequence) {
        this.f4084a.setHintText(charSequence);
    }

    /* JADX INFO: renamed from: y */
    public int m5089y() {
        return this.f4084a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: y0 */
    public void m5090y0(View view) {
        this.f4084a.setLabelFor(view);
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m5091z() {
        return this.f4084a.getPackageName();
    }

    /* JADX INFO: renamed from: z0 */
    public void m5092z0(int i7) {
        this.f4084a.setMaxTextLength(i7);
    }
}
