
#
# Queue implementation need to include these methods:
# enqueue 
# dequeue 
# 
# You'll also need to make your queue accessible through :store
# for tests to work.
# 

class Queue
  attr_accessor :store
  def initialize
    @store = Array.new
  end
  
  def dequeue
    @store.pop
  end
  
  def enqueue(element)
    @store.unshift(element)
    self
  end
end