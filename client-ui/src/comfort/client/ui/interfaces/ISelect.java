package comfort.client.ui.interfaces;

/**
 * Author: Michael Morozov
 * Date: 28.01.2008
 * Time: 1:24:22
 */

/**
 * РЎРµР»РµРєС‚РѕСЂ СЃРІРѕР№СЃС‚РІ СЃСѓС‰РЅРѕСЃС‚Рё. РџРѕР·РІРѕР»СЏРµС‚ СЃРѕРїРѕСЃС‚Р°РІРёС‚СЊ РЅРµРєРѕС‚РѕСЂРѕРµ РёРјРµРЅРѕРІР°РЅРЅРѕРµ СЃРІРѕР№СЃС‚РІРѕ СЃСѓС‰РЅРѕСЃС‚Рё СЃРѕ
 * СЃРїРёСЃРєРѕРј РїР°СЂР°РјРµС‚СЂРѕРІ РІРёРґР° РёРјСЏ = Р·РЅР°С‡РµРЅРёРµ СЃРј. {@link comfort.client.ui.interfaces.IProperty},
 * РѕСЂРіР°РЅРёР·СѓСЏ С‚РµРј СЃР°РјС‹Рј РїСЂР°РІРёР»Рѕ РїСЂРµРѕР±СЂР°Р·РѕРІР°РЅРёСЏ СЃРІРѕР№СЃС‚РІР° СЃСѓС‰РЅРѕСЃС‚Рё
 */
public interface ISelect extends INamed, IGetter<IProperty> {
    /**
     * РЎСЃС‹Р»РєР° РЅР° РїСЂРёР·РјСѓ СЃСѓС‰РЅРѕСЃС‚Рё {@link comfort.client.ui.interfaces.IView} РєРѕС‚РѕСЂРѕРµ Р±СѓРґРµС‚ РёСЃРїРѕР»СЊР·РѕРІР°С‚СЊСЃСЏ РґР»СЏ
     * РїРѕР»СѓС‡РµРЅРёСЏ Р·РЅР°С‡РµРЅРёСЏ РёР· РґР°РЅРЅРѕРіРѕ СЃРІРѕР№СЃС‚РІР° СЃСѓС‰РЅРѕСЃС‚Рё
     * @return Р·РЅР°С‡РµРЅРёРµ СЃСЃС‹Р»Р°РµРјРѕР№ РїСЂРёР·РјС‹ СЃСѓС‰РЅРѕСЃС‚Рё
     */
    IView getRelatedView();
}
