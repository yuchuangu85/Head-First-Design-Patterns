package headfirst.designpatterns.observer.subject;

import headfirst.designpatterns.observer.observer.Observer;

/**
 * 主题接口
 */
public interface Subject {

	// 注册观察者
	void registerObserver(Observer o);

	// 删除观察者
	void removeObserver(Observer o);

	// 通知观察者
	void notifyObservers();

}
